
public class Dog extends Animal{
    private  int numOfClaws;
    private boolean hasKennel;
    private  int tailSize;
    private String id;
    public Dog(int numOfClaws,boolean hasKennel,int tailSize,String id){
        this.numOfClaws = numOfClaws;
        this.hasKennel = hasKennel;
        this.tailSize = tailSize;
        this.id = id;
    }
//    @Override
////    public  int hashCode(){
////        int hashcode = 0 + this.id.hashCode();
////        return hashcode;
////    }
    @Override
    public  boolean equals(Object dog){
        if(dog == null){
            return false;
        }
        if(!(dog instanceof Dog)){
            return false;
        }
        Dog another = (Dog)dog;
        if(this.id.equals(another.getId())){
            return true;
        }
            return false;




    }
    @Override public void produceSound(AnimalType type){
        System.out.println("The dogs sound is making things unclear");
    }
    public  Dog(){
        super();
    }
    public  void testSuper(){
        super.produceSound();
    }
    @Override public String move(){
        super.movement = "jump";
        return movement;
    }
    public  void printNumOfClaws(){
        System.out.println("The num of claws are" + numOfClaws);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

    public boolean isHasKennel() {
        return hasKennel;
    }

    public void setHasKennel(boolean hasKennel) {
        this.hasKennel = hasKennel;
    }
}
