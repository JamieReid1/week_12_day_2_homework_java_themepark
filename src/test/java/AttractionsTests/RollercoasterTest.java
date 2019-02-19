package AttractionsTests;

import Attractions.Rollercoaster;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster pepsiMax;

    @Test
    public void hasName(){
        pepsiMax = new Rollercoaster("Pepsi Max");
        assertEquals("Pepsi Max", pepsiMax.getName());
    }

}
