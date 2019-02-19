package StallsTests;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall flakesNShakes;

    @Before
    public void before(){

        flakesNShakes = new IceCreamStall("Flakes N Shakes", "Beldar Conehead", 1);

    }

    @Test
    public void hasName(){
        assertEquals("Flakes N Shakes", flakesNShakes.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Beldar Conehead", flakesNShakes.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, flakesNShakes.getParkingSpot());
    }

    @Test
    public void canSetThenGetRating(){
        flakesNShakes.setRating(5);
        assertEquals(5, flakesNShakes.getRating());
    }

}
