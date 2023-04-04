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
    public String Fly() { return "I can fly";}

    public int getPropellers() {
        return propellers;
    }

    public void setPropellers(int propellers) {
        this.propellers = propellers;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
