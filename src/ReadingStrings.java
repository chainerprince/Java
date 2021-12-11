
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.StringTokenizer;

public class ReadingStrings {
    public static   Gender stringToEnum(String str){
        if(str.equals("male")){
            return Gender.MALE;
        }else if(str.equals("female")){
            return  Gender.FEMALE;
        }else{

            return Gender.OTHER;
        }

    }
    public static void main(String... args) throws IOException {
        List<Person> people = new ArrayList<Person>();
        File file = new File("D:\\JAVA\\LEARN\\Working\\src\\personStore.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            StringTokenizer tokenizer = new StringTokenizer(sc.nextLine()," ");
            String firstName = tokenizer.nextToken();
            String lastName = tokenizer.nextToken();
            int age = Integer.parseInt(tokenizer.nextToken());
            Gender gender = stringToEnum(tokenizer.nextToken());
            Person p1 = new Person(firstName,lastName,age,gender);
            people.add(p1);

    }
        sc.close();

        Person[] person = people.toArray(new Person[0]);
        for(int i=0;i<person.length;i++){
            System.out.println("Your name is " + person[i].getFirstName() + " " + person[i].getLastName() + " and you are a  " + person[i].gender + " of " + person[i].getAge() + " Years old" );
        }








    }
}
