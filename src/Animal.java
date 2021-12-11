public class Animal {
    static String movement = "Walking";
    private int numOfLegs;
    private String name="jackson";
    private  AnimalType animalType;
    public Animal(){
//        System.out.println("The animal constructor");
    };

    public  void produceSound(){
        System.out.println("The animal overloading preclass");
    }
    public void produceSound(AnimalType type){
        System.out.println("Here is the sound of " + type);
    }

    public String move(){
        return movement;
    }
    public static void main(String... args){
//        produceSound(animalType);
    }

    public String getName() {
        return name;
    }
}
