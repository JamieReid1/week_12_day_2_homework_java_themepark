package ThemeParkTest;

import Attractions.Rollercoaster;
import ThemePark.ThemePark;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark attractionAndStallLand;
    Rollercoaster pepsiMax;

    @Test
    public void canGetAllRated(){
        attractionAndStallLand = new ThemePark();
        pepsiMax = new Rollercoaster("Pepsi Max");
        attractionAndStallLand.add(pepsiMax);
        assertEquals(1, attractionAndStallLand.allReviewedCount());
    }

}
