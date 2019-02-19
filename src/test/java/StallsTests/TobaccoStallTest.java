package StallsTests;

import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall hereTodayGoneTobacco;

    @Before
    public void before(){

        hereTodayGoneTobacco = new TobaccoStall("Here Today, Gone Tobacco", "Joey Ramone", 3);

    }

    @Test
    public void hasName(){
        assertEquals("Here Today, Gone Tobacco", hereTodayGoneTobacco.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Joey Ramone", hereTodayGoneTobacco.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, hereTodayGoneTobacco.getParkingSpot());
    }

}
