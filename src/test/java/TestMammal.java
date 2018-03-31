import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMammal {

    Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal();
    }

    @Test
    public void canEat(){
        assertEquals( "Nom Nom", mammal.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("In and out", mammal.breathe());
    }

    @Test
    public void canTalk(){
        assertEquals("Hello there", mammal.talk());
    }

}
