package AttractionsTests;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park jurassicPark;

    @Before
    public void before(){

        jurassicPark = new Park("Jurassic Park");

    }

    @Test
    public void hasName(){
        assertEquals("Jurassic Park", jurassicPark.getName());
    }

    @Test
    public void canSetThenGetRating(){
        jurassicPark.setRating(5);
        assertEquals(5, jurassicPark.getRating());
    }

}
