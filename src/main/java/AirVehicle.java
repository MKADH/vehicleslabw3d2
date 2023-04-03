public class AirVehicle extends Vehicle{
    public AirVehicle(String name, int wheels, int occupancy, int topSpeed, String fuelType) {
        super(name, wheels, occupancy, topSpeed, fuelType);
    }
    public String Fly(){
        return "I can fly";
    }

}
