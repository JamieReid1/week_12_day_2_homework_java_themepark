package StallsTests;

import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall hereTodayGoneTobacco;
    Visitor adult;
    Visitor child;


    @Before
    public void before(){

        hereTodayGoneTobacco = new TobaccoStall("Here Today, Gone Tobacco", "Joey Ramone", 3);
        adult = new Visitor(30, 1.8, 100);
        child = new Visitor(8, 1.1, 10);
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

    @Test
    public void visitorCanBuyTobacco(){
        assertEquals(true, hereTodayGoneTobacco.isAllowedTo(adult));
    }

    @Test
    public void visitorCanNotBuyTobacco(){
        assertEquals(false, hereTodayGoneTobacco.isAllowedTo(child));
    }

    @Test
    public void canSetThenGetRating(){
        hereTodayGoneTobacco.setRating(1);
        assertEquals(1, hereTodayGoneTobacco.getRating());
    }

}
