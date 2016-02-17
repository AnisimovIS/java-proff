/**
 * Created by Ilya on 16.02.2016.
 */
public class Example2 {
    public static void main(String[] args){
        class Greeteng  {
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
            public  void say(String name){
                System.out.println("Hello " + name);
            }
        }
        Greeteng greeteng = new Greeteng();
        greeteng.greet("as");
    }
}
