package AttractionsTests;

import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground swingsAndThings;
    Visitor child;
    Visitor adult;

    @Before
    public void before(){

        swingsAndThings = new Playground("Swings & Things");

    }


    @Test
    public void hasName(){
        assertEquals("Swings & Things", swingsAndThings.getName());
    }

    @Test
    public void isAllowed(){
        child = new Visitor(8, 1.1, 10);
        assertEquals(true, swingsAndThings.isAllowedTo(child));
    }

    @Test
    public void isNotAllowed(){
        adult = new Visitor(30, 1.8, 100);
        assertEquals(false, swingsAndThings.isAllowedTo(adult));
    }

    @Test
    public void canSetThenGetName(){
        swingsAndThings.setRating(3);
        assertEquals(3, swingsAndThings.getRating());
    }

}
