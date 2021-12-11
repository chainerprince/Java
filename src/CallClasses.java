import java.util.HashSet;
import java.util.Set;

public class CallClasses {
    public  FoodComposition processFood(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;

            return new FoodComposition("bones","salt",dog);
        }else{
            return new FoodComposition("food","food",(Cow)animal);
        }
//
    }
    public static  void main(String... args){
//        Animal animal = new Animal();
//        animal.produceSound(AnimalType.CARNIVORE);
//        Animal dog = new Dog(2);
//         CallClasses calling = new CallClasses();
//        FoodComposition food = calling.processFood(dog);
//        System.out.println(food.getMainFood());
//        System.out.println(food.getOwner());
////        food.getOwner().printNumOfClaws();

//        System.out.println(dog.getName());
//        dog.produceSound(AnimalType.CARNIVORE);
//        ((Dog) dog).printNumOfClaws();

       Set<Dog> dogs = new HashSet<Dog>();
       Dog dog1 = new Dog(2,true,3,"3");
        Dog dog2 = new Dog(2,true,3,"3");
        if(dog1.equals(dog2)){
            System.out.println("They are the same dog");
        }else{
            System.out.println("They are not the same dog");
        }
       dogs.add(new Dog(2,true,3,"3"));
        dogs.add(new Dog(2,true,3,"3"));


        for(Dog dog:dogs){
            System.out.println(dog.getId());
        }


//        System.out.println(dog1.move());
//        dog1.testSuper();
//        System.out.println(dog1);

//        dog.produceSound();
    }
}
