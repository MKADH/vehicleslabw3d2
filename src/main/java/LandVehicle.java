import java.util.ArrayList;

public class LandVehicle extends Vehicle{
    private ArrayList<Vehicle> vehicle;
    public LandVehicle(String name, int wheels, int occupancy, int topSpeed, String fuelType) {
        super(name, wheels, occupancy, topSpeed, fuelType);
        this.vehicle = new ArrayList<>();
    }
    public int countLandVehicles(){
        return this.vehicle.size();
    }
    public void addLandVehicles(Vehicle vehicle){
        this.vehicle.add(vehicle);
    }





}
