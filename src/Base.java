class Bases extends Exception {
}
class Derived extends Bases {
}
public class Base {
    public static void main(String args[]) throws Exception {
        try {
            int i;
            int sum;
            sum = 10;
            for (i = -1; i < 3 ;++i)
                sum = (sum / i);
        }
        catch(ArithmeticException e) {
            System.out.print("0");
        }
        System.out.print(sum);
    }
}