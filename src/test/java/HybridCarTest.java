import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HybridCarTest {

    private HybridCar pcar;
    private Tyre tyre;

    @Before
    public void setUp() {
        tyre = new Tyre("Goodyear", "Winter");
        pcar = new HybridCar(tyre, EngineType.HYBRID, "red", "Ford", true, 20000);
    }

    @Test
    public void getEngine() {
        assertEquals(EngineType.HYBRID, pcar.getEngine());
    }

    @Test
    public void getTyres() {
        assertEquals(tyre, pcar.getTyres());
    }

    @Test
    public void getColor() {
        assertEquals("red", pcar.getColor());
    }

    @Test
    public void getMake() {
        assertEquals("Ford", pcar.getMake());
    }

    @Test
    public void getRental() {
        assertEquals(true, pcar.getRental());
    }

    @Test
    public void getRentPrice() {
        assertEquals(280, pcar.getRentPrice(), 0.001);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(35000, pcar.getBuyPrice(), 0.001);
    }
}