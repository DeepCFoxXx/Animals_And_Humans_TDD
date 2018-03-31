import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHuman {

    Human Kara;

    @Before
    public void before(){
        Kara = new Human();
    }
    @Test
    public void canEat(){
        assertEquals("Nom Nom", Kara.eat());
    }

}
