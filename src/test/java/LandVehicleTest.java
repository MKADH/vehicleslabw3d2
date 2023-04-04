import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LandVehicleTest {
    LandVehicle landVehicle;

    @BeforeEach
    public void setUp(){
        landVehicle = new LandVehicle("Storage",4, 5, 200, "Petrol/Diesel");

    }
    @Test
    public void noLandVehicles(){
        assertThat(landVehicle.countLandVehicles()).isEqualTo(0);
    }
    @Test
    public void canAddLandVehicles(){
        Vehicle vehicle1 = new Car("Steve", 4, 6, 200, "Batmobile", "Petrol");
        Vehicle vehicle2 = new Train("BoB", 20, 200, 300, "Diesel");
        landVehicle.addLandVehicles(vehicle1);
        landVehicle.addLandVehicles(vehicle2);
        assertThat(landVehicle.countLandVehicles()).isEqualTo(2);
    }
    @Test
    public void canGetArrayList(){
        assertThat(landVehicle.getVehicle()).isEqualTo(new ArrayList());
    }
}
