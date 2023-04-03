import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    Car car;
    @BeforeEach
    public void setUp(){
        car = new Car("Mcqueen", 4, 5, 200, "Toyota Yaris", "Petrol");
    }
    @Test
            public void whatAboutCarsMovie(){
        assertThat(car.carsMovie()).isEqualTo("Awesome, what a classic");
    }
    @Test
    public void doYouHaveABugatti(){
        assertThat(car.carType()).isEqualTo("No Mr Andrew Tate, I have a Toyota");
    }

}
