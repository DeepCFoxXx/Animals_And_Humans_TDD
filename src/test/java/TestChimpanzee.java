import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestChimpanzee {

    Chimpanzee bubbles;

    @Before
    public void before(){
        bubbles = new Chimpanzee();
    }
    @Test
    public void canEat(){
        assertEquals("Nom Nom", bubbles.eat());
    }

}
