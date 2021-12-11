public class VariableScopeDemo {
   static int status;
   static String message = "Prince of Persia";
    public static   void main(String[] args){
        Person p1 = new Person("angel","Kalisa",20,Gender.OTHER);
        p1.setAge(19);
        System.out.println("p1 firstname " + p1.getFirstName());
        System.out.println("p1 age " + p1.getAge());
        System.out.println("The gender is " + p1.gender);



//        String response;
//        checkGlobal();
//
//        firstInstance();
//        secondInstance();


//        System.out.println("S1 message is ="+s1.message + " " + "s1 status is = " + s1.status);


    }

    public static void checkGlobal(){
        System.out.println(message);
    }

    public  static void firstInstance(){
        VariableScopeDemo s1 = new VariableScopeDemo();
        s1.message = "Hello1";
        s1.status = 200;
        System.out.println("S1 message is ="+s1.message + " " + "s1 status is = " + s1.status);
    }

    public  static void secondInstance(){
        VariableScopeDemo s2 = new VariableScopeDemo();
        s2.message = "Hello2";
        s2.status = 400;
        System.out.println("S1 message is ="+s2.message + " " + "s1 status is = " + s2.status);
    }

}




