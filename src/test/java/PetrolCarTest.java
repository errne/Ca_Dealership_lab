import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetrolCarTest {

    private PetrolCar pcar;
    private Tyre tyre;

    @Before
    public void setUp() {
        tyre = new Tyre("Goodyear", "Winter");
        pcar = new PetrolCar(tyre, EngineType.PETROL, "red", "Range Rover", true, 9000);
    }

    @Test
    public void getEngine() {
        assertEquals(EngineType.PETROL, pcar.getEngine());
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
        assertEquals("Range Rover", pcar.getMake());
    }

    @Test
    public void getRental() {
        assertEquals(true, pcar.getRental());
    }

    @Test
    public void getRentPrice() {
        assertEquals(250, pcar.getRentPrice(), 0.001);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(30000, pcar.getBuyPrice(), 0.001);
    }

    @Test
    public void hasCost(){
        assertEquals(9000, pcar.getCost(), 0.001);
    }

    @Test
    public void canRentWithDamage(){
        pcar.setDamage(20);
        assertEquals(230, pcar.getRentPrice(), 0.001);
    }
}