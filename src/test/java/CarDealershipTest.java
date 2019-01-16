import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarDealershipTest {
    private CarDealership ccc;
    private PetrolCar pcar;
    private Tyre tyre;
    private ElectricCar ecar;

    @Before
    public void setUp() throws Exception {
        tyre = new Tyre("Goodyear", "Winter");
        pcar = new PetrolCar(tyre, EngineType.PETROL, "red", "Range Rover", true, 9000);
        ecar = new ElectricCar(tyre, EngineType.ELECTRIC, "redish", "Rover", false, 10000);
        ccc = new CarDealership("Can't drive");

    }

    @Test
    public void getName() {
        assertEquals("Can't drive", ccc.getName());
    }

    @Test
    public void getCarCount() {
        assertEquals(0, ccc.getCarCount());
    }

    @Test
    public void getTill() {
        assertEquals(100000, ccc.getTill(), 0.001);
    }

    @Test
    public void canAddCar(){
        ccc.addCar(pcar);
        assertEquals(1, ccc.getCarCount());
    }

    @Test
    public void canGetCarPrice(){
        ccc.addCar(pcar);
        assertEquals(250, ccc.getCarPrice(pcar), 0.001);

    }

    @Test
    public void canBuyCar(){
        ccc.buyCar(pcar);
        assertEquals(1, ccc.getCarCount());
        assertEquals(91000, ccc.getTill(), 0.001);
    }

    @Test
    public void canRentCar(){
        ccc.addCar(pcar);
        assertEquals(1, ccc.getCarCount());
        ccc.sellOrRentCar(pcar);
        assertEquals(0, ccc.getCarCount());
        assertEquals(100250, ccc.getTill(), 0.001);
    }

    @Test
    public void canSellCar(){
        ccc.addCar(ecar);
        assertEquals(1, ccc.getCarCount());
        ccc.sellOrRentCar(ecar);
        assertEquals(0, ccc.getCarCount());
        assertEquals(155000, ccc.getTill(), 0.001);
    }

    @Test
    public void canRepairCar(){
        ccc.addCar(pcar);
        assertEquals(1, ccc.getCarCount());
        pcar.setDamage(20);
        assertEquals(230, pcar.getRentPrice(), 0.001);
        ccc.repairCar(pcar);
        assertEquals(99980, ccc.getTill(), 0.001);
        assertEquals(250, pcar.getRentPrice(), 0.001);
        assertEquals(0, pcar.getDamage(), 0.001);


    }
}