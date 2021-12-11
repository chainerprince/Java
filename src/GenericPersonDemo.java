import java.util.ArrayList;
import java.util.List;

public class GenericPersonDemo {
    public static void main(String... args){
//        GenericPerson<Integer,String> john = new GenericPerson<>(2,"Male");
//        john.setAge(12);
//        System.out.println(john.getAge());
//        System.out.println(john.getGender());
//    studio key    c963499ad353fefd8fb1d339b0a69fcbbca3d765
        List<String> myList = new ArrayList();
        myList.add("Test");
//        myList.add(10);


        for(int i =0;i<2;i++){
            System.out.println(myList.get(i));
        }
    }
}
