import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Craig", "NI1234", 10000.0, "Board", 100000.0);
    }

    @Test
    public void getBudget() {
        assertEquals(100000.0, director.getBudget(), 0.001);
    }



}
