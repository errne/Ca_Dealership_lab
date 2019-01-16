public class ElectricCar extends Car {
    private double rentPrice;
    private double buyPrice;

    public ElectricCar(Tyre tyres, EngineType engine, String color, String make, Boolean isRental, double cost) {
        super(tyres, engine, color, make, isRental, cost);
        this.rentPrice = 380;
        this.buyPrice = 55000;
    }


    public double getRentPrice() {
        return rentPrice;
    }

    public double getBuyPrice() {
//        TODO: if rent cant buy vice verus
        return buyPrice;
    }
}
