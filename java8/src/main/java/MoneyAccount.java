
public final class MoneyAccount {
    private static MoneyAccount instance;
    private Integer account;

    private MoneyAccount() {
        account = 10;
    }

    public static MoneyAccount getInstance() {
        if (instance == null) {
            instance = new MoneyAccount();
        }
        return instance;
    }

    public void cache(final int amount) {
        account -= amount;
    }

    public Integer getAccount() {
        return account;
    }

    static final class CachePoint extends Thread {
        private static final MoneyAccount money_account = getInstance();
        private Integer id;
        private String userName;
        private Integer cacheAmount;

        public void setId(Integer id) {
            this.id = id;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setCacheAmount(Integer cacheAmount) {
            this.cacheAmount = cacheAmount;
        }

        @Override
        public void run() {
            synchronized (money_account) {
                final int previousAccountValue = MoneyAccount.getInstance().getAccount();
                if (previousAccountValue < cacheAmount) {
                    System.out.println(userName + " не смог снять деньги. Недостаточно средств");
                    return;
                }
                MoneyAccount.getInstance().cache(cacheAmount);
                final StringBuilder message = new StringBuilder();
                message.append("Произведено снятие средств пользоваталем ");
                message.append(userName);
                message.append(" с банкомата ");
                message.append(id);
                message.append(" на сумму ");
                message.append(cacheAmount);
                message.append(". Остаток на счете до снятия:  ");
                message.append(previousAccountValue);
                message.append(", после снятия: ");
                message.append(MoneyAccount.getInstance().getAccount());
                System.out.println(message);
            }
        }
    }

    static final class BrokenCachePoint extends Thread {
        private Integer id;
        private String userName;
        private Integer cacheAmount;

        public void setId(Integer id) {
            this.id = id;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setCacheAmount(Integer cacheAmount) {
            this.cacheAmount = cacheAmount;
        }

        @Override
        public void run() {
            final int previousAccountValue = MoneyAccount.getInstance().getAccount();
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (previousAccountValue < cacheAmount) {
                System.out.println(userName + " не смог снять деньги. Недостаточно средств");
                return;
            }
            MoneyAccount.getInstance().cache(cacheAmount);
            final StringBuilder message = new StringBuilder();
            message.append("Произведено снятие средств пользоваталем ");
            message.append(userName);
            message.append(" с банкомата ");
            message.append(id);
            message.append(" на сумму ");
            message.append(cacheAmount);
            message.append(". Остаток на счете до снятия:  ");
            message.append(previousAccountValue);
            message.append(", после снятия: ");
            message.append(MoneyAccount.getInstance().getAccount());
            System.out.println(message);
        }
        public static void main(String[] args) throws InterruptedException {
            /**
             * Пример с исправными банкоматами
             */
            System.out.println("Ситуация №1. Мы используем исправные банкоматы");
            CachePoint point1 = new CachePoint();
            point1.setId(1);
            point1.setCacheAmount(5);
            point1.setUserName("Вася");

            CachePoint point2 = new CachePoint();
            point2.setId(2);
            point2.setCacheAmount(5);
            point2.setUserName("Петя");

            CachePoint point3 = new CachePoint();
            point3.setId(3);
            point3.setCacheAmount(5);
            point3.setUserName("Джо");

            point1.start();
            point2.start();
            point3.start();

            //подождем 100 мс. пока все потоки сделают своё дело
            sleep(100);

            // установим значение счета обратно в 10
            MoneyAccount.getInstance().account = 10;
            System.out.println();

            /**
             * Пример с неисправными банкоматами
             */

            System.out.println("Ситуация №2. Мы используем неисправные банкоматы");
            BrokenCachePoint bpoint1 = new BrokenCachePoint();
            bpoint1.setId(1);
            bpoint1.setCacheAmount(5);
            bpoint1.setUserName("ЗлойВася");

            BrokenCachePoint bpoint2 = new BrokenCachePoint();
            bpoint2.setId(2);
            bpoint2.setCacheAmount(5);
            bpoint2.setUserName("НедовольныйПетя");

            BrokenCachePoint bpoint3 = new BrokenCachePoint();
            bpoint3.setId(3);
            bpoint3.setCacheAmount(5);
            bpoint3.setUserName("ДжоВБешенстве");

            bpoint1.start();
            bpoint2.start();
            bpoint3.start();

        }

    }
}
