public class Train extends LandVehicle{

    private double trainLength;
    public Train(String name, int wheels, int occupancy, int topSpeed, String fuelType) {
        super(name, wheels, occupancy, topSpeed, fuelType);
        this.trainLength = 30;
    }

    public boolean publicTravel(){
        return true;
    }
    public boolean moveWithoutDriver(){
        return true;
    }
    public double getTrainLength(){
        return this.trainLength;
    }
    public String Sheldon(){
        return "Bezinga, of course he does";
    }
    public String park(){
        return "Only on platforms & depots";
    }
}
