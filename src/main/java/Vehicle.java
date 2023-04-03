import java.util.ArrayList;

public abstract class Vehicle {

    private String name;
    private int wheels;
    private int occupancy;
    private int topSpeed;
    private String fuelType;

    public Vehicle(String name, int wheels, int occupancy, int topSpeed, String fuelType){
        this.name = name;
        this.wheels = wheels;
        this.occupancy = occupancy;
        this.topSpeed = topSpeed;
        this.fuelType = fuelType;
    }
    public boolean publicTravel(){
        return true;
    }
    public boolean moveWithoutDriver(){
        return true;
    }
    public String park(){
        return "Anywhere";
    }








}
