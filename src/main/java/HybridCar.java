public class HybridCar extends Car {

    private double rentPrice;
    private double buyPrice;

    public HybridCar(Tyre tyres, EngineType engine, String color, String make, Boolean isRental, double cost) {
        super(tyres, engine, color, make, isRental, cost);
        this.rentPrice = 280;
        this.buyPrice = 35000;
    }


    public double getRentPrice() {
        return rentPrice;
    }

    public double getBuyPrice() {
//        TODO: if rent cant buy vice verus
        return buyPrice;
    }


}
