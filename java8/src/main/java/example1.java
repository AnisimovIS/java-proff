public class example1 {

    public static class Test118 extends _Test118 {
        {
            System.out.print("_INIT");
        }

        static {
            System.out.print("_STATIC");
        }

        Test118() {
            System.out.print("_CONST");
        }

        public static void main(String[] args) {
            System.out.print("_MAIN");
            new Test118();
        }
    }

    static class _Test118 {
        _Test118() {
            System.out.print("_BASE");
        }


    }
}