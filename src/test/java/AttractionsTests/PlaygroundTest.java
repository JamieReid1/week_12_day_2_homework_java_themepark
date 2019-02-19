package AttractionsTests;

import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground swingsAndThings;
    Visitor child;
    Visitor adult;


    @Test
    public void hasName(){
        swingsAndThings = new Playground("Swings & Things");
        assertEquals("Swings & Things", swingsAndThings.getName());
    }

    @Test
    public void isAllowed(){
        swingsAndThings = new Playground("Swings & Things");
        child = new Visitor(8, 1.1, 10);
        assertEquals(true, swingsAndThings.isAllowedTo(child));
    }

    @Test
    public void isNotAllowed(){
        swingsAndThings = new Playground("Swings & Things");
        adult = new Visitor(30, 1.8, 100);
        assertEquals(false, swingsAndThings.isAllowedTo(adult));
    }

}
