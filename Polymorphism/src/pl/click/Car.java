package pl.click;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car --> start engine";

    }
    public String accelerate(){
        return "Car -->  accelerates";
    }
    public String brake(){
        return "Car -->  brakes";
    }
}
