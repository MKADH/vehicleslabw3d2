public class Helicopter extends AirVehicle{

    private int propellers;
    private double mass;



    public Helicopter(String name, int wheels, int occupancy, int topSpeed, String fuelType) {
        super(name, wheels, occupancy, topSpeed, fuelType);
        this.propellers = 2;
        this.mass = 2000.5;
    }

    public boolean publicTravel(){
        return false;
    }
    public boolean moveWithoutDriver(){
        return false;
    }
    public int npropellers(){
        return this.propellers;
    }
    public double mass(){
        return this.mass;
    }
    public String park(){
        return "Only on Helipads";
    }
}
