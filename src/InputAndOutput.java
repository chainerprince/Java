import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputAndOutput {
    public  static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        System.out.println("Please enter your data separated with spaces: ");
        String data = reader.readLine();

        StringTokenizer tokenizer = new StringTokenizer(data," ");


       String firstName = tokenizer.nextToken();
       String lastName = tokenizer.nextToken();
        int age = Integer.parseInt(tokenizer.nextToken());
//        System.out.println("Please enter your lname: ");
//        String lname = reader.readLine();




        Person p1 = new Person(firstName,lastName,age,Gender.MALE);

        System.out.println("Your name is " + p1.getFirstName() + " " + p1.getLastName() + " and you are " + p1.getAge() + " Years old" );
    }
}
