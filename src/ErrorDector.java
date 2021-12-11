public class ErrorDector {
    public  static void  errorGenerator() throws MyCustomException{
        int a = 6;
        if(a>4){
            throw new MyCustomException("The exception msg");
        }
        throw new MyCustomException("the mesgage");

    }
    public  static  void main(String... args){
        try{
            errorGenerator();
        }catch(MyCustomException e){
            System.out.println(e.getMsg());
        }




    }

}
