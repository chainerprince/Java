public class Association {
    public  static  void main(String... args){
        Engine engine = new Engine(2,"xtderiaperia",2000);
        Vehicle vehicle = new Vehicle("car","23rexmextreme404",engine);
        System.out.println(vehicle.getName());
        System.out.println(vehicle.getEngine().size);
    }
}
