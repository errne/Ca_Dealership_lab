import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    private ElectricCar pcar;
    private Tyre tyre;

    @Before
    public void setUp() {
        tyre = new Tyre("Goodyear", "Winter");
        pcar = new ElectricCar(tyre, EngineType.ELECTRIC, "redish", "Rover", false, 10000);
    }

    @Test
    public void getEngine() {
        assertEquals(EngineType.ELECTRIC, pcar.getEngine());
    }

    @Test
    public void getTyres() {
        assertEquals(tyre, pcar.getTyres());
    }

    @Test
    public void getColor() {
        assertEquals("redish", pcar.getColor());
    }

    @Test
    public void getMake() {
        assertEquals("Rover", pcar.getMake());
    }

    @Test
    public void getRental() {
        assertEquals(false, pcar.getRental());
    }

    @Test
    public void getRentPrice() {
        assertEquals(380, pcar.getRentPrice(), 0.001);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(55000, pcar.getBuyPrice(), 0.001);
    }
}