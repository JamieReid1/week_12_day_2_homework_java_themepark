package AttractionsTests;

import Attractions.Dodgem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem sparkyBangBang;

    @Test
    public void hasName(){
        sparkyBangBang = new Dodgem("Sparky Bang Bang");
        assertEquals("Sparky Bang Bang", sparkyBangBang.getName());
    }

}
