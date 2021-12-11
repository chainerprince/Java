import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerDemo {
    public static Gender stringToEnum(String str){
        if(str.equals("male")){
            return Gender.MALE;
        }else if(str.equals("female")){
            return  Gender.FEMALE;
        }else{

            return Gender.OTHER;
        }


    }
    public static void main(String... args){
        List<Person> people = new ArrayList<Person>();
        System.out.println("Enter information of people here");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of people to insert");

        int numberOfPeople = scan.nextInt();
        for(int i=0;i<numberOfPeople;i++){
            System.out.println("Please enter  firstname");
            String firstName = scan.next();
            System.out.println("Pleaes enter  lastname");
            String lastName = scan.next();
            System.out.println("Please enter  age");
            int age = scan.nextInt();
            System.out.println("Please enter  gender");
            String gender = scan.next();
            Person p1 = new Person(firstName,lastName,age,stringToEnum(gender));
            people.add(p1);

            System.out.println("Please enter info for another person ");
        }



        Person[] person = people.toArray(new Person[0]);
        for(int i=0;i<person.length;i++){

            int k = i+1;
            System.out.println(
                    "Person " + k + " Information " + "\n" +
                            "Firstname: " + person[i].getFirstName() + "\n"+
                            "Lastname: " + person[i].getLastName() + "\n" +
                            "age: " + person[i].getAge() + "\n"+
                            "gender: " + person[i].gender + "\n"

            );



        }

    }
}
