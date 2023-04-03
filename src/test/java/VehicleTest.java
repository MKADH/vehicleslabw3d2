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
}
