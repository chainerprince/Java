public class HelloWorld {
    public static  void main(String... args){
        System.out.println("Hello World and thing working cool");
        if(2>4){
            System.out.println("Java works like Kings");
        }else{
            System.out.println("A block of code that makes things clear");
        }
        int x = 5;
//        while(x<=4){
//            System.out.println("I is " + x);
//            x++;
//        }

        do {
            System.out.println("Waiting the condition to come true");
            x++;
        }while (x <= 4);
    }
}
