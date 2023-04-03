import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {
    Train train;
    @BeforeEach
    public void setUp(){
        train = new Train("Thomas", 20, 200, 120, "Diesel");
    }

    @Test
    public void whatsTrainLength(){
        assertThat(train.getTrainLength()).isEqualTo(30);
    }
    @Test
    public void sheldonHatesIt(){
        assertThat(train.Sheldon()).isEqualTo("Bezinga, of course he does");
    }


}
