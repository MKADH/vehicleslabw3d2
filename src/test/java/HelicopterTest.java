import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {
    Helicopter helicopter;

    @BeforeEach
    public void setUp(){
        helicopter = new Helicopter("Black Hawk", 3, 8, 500, "Kerosene");
    }

    @Test
    public void numberOfPropellers(){
        assertThat(helicopter.npropellers()).isEqualTo(2);
    }
    @Test
    public void massOfHeli(){
        assertThat(helicopter.mass()).isEqualTo(2000.5);
    }
    @Test
    public void canFly(){
        assertThat(helicopter.Fly()).isEqualTo("I can fly");
    }
    @Test
    public void canPark(){
        assertThat(helicopter.park()).isEqualTo("Only on Helipads");
    }

}
