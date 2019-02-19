package AttractionsTests;

import Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem sparkyBangBang;

    @Before
    public void before(){

        sparkyBangBang = new Dodgem("Sparky Bang Bang");

    }

    @Test
    public void hasName(){
        assertEquals("Sparky Bang Bang", sparkyBangBang.getName());
    }

    @Test
    public void canSetThenGetRating(){
        sparkyBangBang.setRating(5);
        assertEquals(5, sparkyBangBang.getRating());
    }

}
