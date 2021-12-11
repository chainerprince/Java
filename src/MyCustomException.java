public class MyCustomException extends Exception{
  private  String msg;

    public MyCustomException(String msg){
        this.msg = msg;

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
