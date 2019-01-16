public class ElectricCar extends Car {
    private double rentPrice;
    private double buyPrice;

    public ElectricCar(Tyre tyres, EngineType engine, String color, String make, Boolean isRental, double cost) {
        super(tyres, engine, color, make, isRental, cost);
        this.rentPrice = 380;
        this.buyPrice = 55000;
    }


    public double getRentPrice() {

        return rentPrice - getDamage();
    }

    public void setRentPrice(Double newPrice){
        this.rentPrice = newPrice;
    }

    public double getBuyPrice() {
//        TODO: if rent cant buy vice verus
        return buyPrice - getDamage();
    }
}
