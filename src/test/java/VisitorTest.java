import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor axelFoley;

    @Before
    public void before(){

        axelFoley = new Visitor(30, 1.75, 1000000);

    }

    @Test
    public void hasAge(){
        assertEquals(30, axelFoley.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.75, axelFoley.getHeight(), 0.01);
    }

    @Test
    public void hasMoney(){
        assertEquals(1000000, axelFoley.getMoney(), 0.01);
    }

}
