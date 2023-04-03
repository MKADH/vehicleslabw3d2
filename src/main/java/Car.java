public class Car extends LandVehicle{
    private String type;

    public Car(String name, int wheels, int occupancy, int topSpeed, String type, String fuelType) {
        super(name, wheels, occupancy, topSpeed, fuelType);
        this.type = type;
    }

    public boolean moveWithoutDriver() {
        return true;
    }
    public String carsMovie(){
        return ("Awesome, what a classic");
    }
    public String carType(){
        return "No Mr Andrew Tate, I have a Toyota";
    }
    public String park(){
        return "Only on designated roads and car parks";
    }
}
