import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Keith", "NI1337", 24000.0, "Management");
    }

    @Test
    public void getDeptName() {
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void getName() {
        assertEquals("Keith", manager.getName());
    }

    @Test
    public void getNI() {
        assertEquals("NI1337", manager.getNI());
    }

    @Test
    public void getSalary() {
        assertEquals(24000.0, manager.getSalary(), 0.001);
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(29000.0, manager.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(240.0, manager.payBonus(), 0.001);
    }
}
