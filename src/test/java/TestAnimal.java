import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnimal {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal();
    }

    @Test
    public void canEat(){
        assertEquals( "Nom Nom", animal.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("In and out", animal.breathe());
    }

}
