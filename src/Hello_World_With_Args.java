public class Hello_World_With_Args {
    public static  void main(String... args){
//        System.out.println("Hello: "+ args[0]);
//        for (int i=0; i<args.length;i++){
//            System.out.println(args[i]);
//        }
       firstMethod();
        String[] students = {"jackson","Jack","Bruce"};
        for(String student: students){
            System.out.println(student);
        }
//        for (int x = 0; x< students.length; x++){
//            System.out.println(students[x]);
//        }
    }

    public  static void firstMethod(){
        System.out.println("The method inside a class");
    }
}
