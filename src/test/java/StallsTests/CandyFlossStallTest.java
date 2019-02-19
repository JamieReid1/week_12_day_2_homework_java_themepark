package StallsTests;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall funSpunCandy;

    @Before
    public void before(){

        funSpunCandy = new CandyFlossStall("Fun Spun Candy", "Marge Simpson", 2);

    }

    @Test
    public void hasName(){
        assertEquals("Fun Spun Candy", funSpunCandy.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Marge Simpson", funSpunCandy.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, funSpunCandy.getParkingSpot());
    }

}
