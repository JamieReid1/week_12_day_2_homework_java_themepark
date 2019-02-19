import org.junit.Before;

public class VisitorTest {

    Visitor AxelFoley;

    @Before
    public void before(){

        AxelFoley = new Visitor(30, 1.75, 1000000);

    }

}
