import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;


    @Test
    public void canPubliclyTravel(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        assertThat(vehicle1.publicTravel()).isEqualTo(false);
        assertThat(vehicle2.publicTravel()).isEqualTo(true);
    }
    @Test
    public void canMoveWithoutDriver(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        Vehicle vehicle3 = new Car("Tesla", 4, 5, 160, "Toyota Yaris", "Petrol");
        assertThat(vehicle1.moveWithoutDriver()).isEqualTo(false);
        assertThat(vehicle2.moveWithoutDriver()).isEqualTo(true);
        assertThat(vehicle3.moveWithoutDriver()).isEqualTo(true);
    }
    @Test
    public void canGetName(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        Vehicle vehicle3 = new Car("Tesla", 4, 6, 160, "Toyota Yaris", "Petrol");

        assertThat(vehicle1.getName()).isEqualTo("Black Hawk");
        assertThat(vehicle2.getName()).isEqualTo("Thomas");
        assertThat(vehicle3.getName()).isEqualTo("Tesla");
    }
    @Test
    public void canGetOccupancy(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        Vehicle vehicle3 = new Car("Tesla", 4, 6, 160, "Toyota Yaris", "Petrol");

        assertThat(vehicle1.getOccupancy()).isEqualTo(5);
        assertThat(vehicle2.getOccupancy()).isEqualTo(200);
        assertThat(vehicle3.getOccupancy()).isEqualTo(6);

    }
    @Test
    public void canGetWheels(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        Vehicle vehicle3 = new Car("Tesla", 4, 6, 160, "Toyota Yaris", "Petrol");
        assertThat(vehicle1.getWheels()).isEqualTo(3);
        assertThat(vehicle2.getWheels()).isEqualTo(30);
        assertThat(vehicle3.getWheels()).isEqualTo(4);
    }
    @Test
    public void canGetTopSpeed(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        Vehicle vehicle3 = new Car("Tesla", 4, 6, 160, "Toyota Yaris", "Petrol");
        assertThat(vehicle1.getTopSpeed()).isEqualTo(400);
        assertThat(vehicle2.getTopSpeed()).isEqualTo(300);
        assertThat(vehicle3.getTopSpeed()).isEqualTo(160);
    }
    @Test
    public void canGetFuelType(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        Vehicle vehicle2 = new Train("Thomas", 30, 200, 300, "Diesel");
        Vehicle vehicle3 = new Car("Tesla", 4, 6, 160, "Toyota Yaris", "Petrol");
        assertThat(vehicle1.getFuelType()).isEqualTo("Kerosene");
        assertThat(vehicle2.getFuelType()).isEqualTo("Diesel");
        assertThat(vehicle3.getFuelType()).isEqualTo("Petrol");
    }
    @Test
    public void canOverload(){
        Vehicle vehicle1 = new Helicopter("Black Hawk", 3, 5, 400, "Kerosene");
        assertThat(vehicle1.addRandom("Black Hawk", 5)).isEqualTo(408);
        assertThat(vehicle1.addRandom(400)).isEqualTo(400);
        System.out.println(vehicle1.addRandom("Black Hawk",5));
    }













}
