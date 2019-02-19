package AttractionsTests;

import Attractions.Park;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park jurassicPark;

    @Test
    public void before(){
        jurassicPark = new Park("Jurassic Park");
        assertEquals("Jurassic Park", jurassicPark.getName());
    }

}
