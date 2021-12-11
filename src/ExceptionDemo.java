public class ExceptionDemo {
      public    Boolean isInt(String number) throws Exception{
          try{
              Integer.parseInt(number);
              return true;
          }catch (Exception e){
//              return false;
              throw new NumberFormatException("Your input is not a number "+e.getMessage());
//              throw  e;
          }
          finally {
              System.out.println("The program will always execute this");
          }
      }
    public static void main(String... args) throws Exception{
        int a = 10; int b = 0;
       ExceptionDemo excepter = new ExceptionDemo();

        System.out.println("Before triggering the exception");
        try{
            Boolean value = excepter.isInt("3");
            System.out.println(value);
            if(value){
                System.out.println("The value is a number");
            }
            int nums[] = {1,2,3};
//            System.out.println(nums[12]);
            for(int i =  0; i<=4;i++){
                try{
                    System.out.println(nums[i]);
                }catch (IndexOutOfBoundsException ioe){
//                    ioe.printStackTrace();
                    continue;
                }
            }
            double quotient = a/b;
            System.out.println("The quotient is " + quotient);
        }catch (ArithmeticException ae){

            ae.printStackTrace();
            System.out.println(ae.getStackTrace());
        }
        catch (Exception e){
            e.printStackTrace();
        }

 System.out.println("The program reached here");

    }
}
