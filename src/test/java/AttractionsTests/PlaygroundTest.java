package AttractionsTests;

import Attractions.Playground;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground swingsAndThings;

    @Test
    public void hasName(){
        swingsAndThings = new Playground("Swings & Things");
        assertEquals("Swings & Things", swingsAndThings.getName());
    }

}
