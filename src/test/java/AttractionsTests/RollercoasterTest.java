package AttractionsTests;

import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster pepsiMax;
    Visitor adult;
    Visitor child;

    @Before
    public void before(){

        pepsiMax = new Rollercoaster("Pepsi Max");
        adult = new Visitor(30, 1.8, 100);
        child = new Visitor(8, 1.1, 10);

    }

    @Test
    public void hasName(){
        assertEquals("Pepsi Max", pepsiMax.getName());
    }

    @Test
    public void visitorIsAllowedTooRide(){
        assertEquals(true, pepsiMax.isAllowedTo(adult));
    }

    @Test
    public void visitorIsNotAllowedToRide(){
        assertEquals(false, pepsiMax.isAllowedTo(child));
    }

    @Test
    public void canSetThenGetRating(){
        pepsiMax.setRating(5);
        assertEquals(5, pepsiMax.getRating());
    }

}
