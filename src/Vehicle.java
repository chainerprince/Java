public class Vehicle {
    private String name;
    private String model;
    private VehicleType type;
    private Engine engine;

    public  Vehicle(){};
    public  Vehicle(String name,String model,Engine engine){
        this.model = model;
        this.name = name;
        this.engine = engine;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
