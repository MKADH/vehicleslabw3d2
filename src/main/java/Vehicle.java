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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
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
