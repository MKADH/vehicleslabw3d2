public class Helicopter extends AirVehicle{

    private int propellers;
    private int mass;



    public Helicopter(String name, int wheels, int occupancy, int topSpeed, String fuelType) {
        super(name, wheels, occupancy, topSpeed, fuelType);
        this.propellers = 2;
        this.mass = 2000;
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
    public int mass(){
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

    public void setMass(int mass) {
        this.mass = mass;
    }
}
