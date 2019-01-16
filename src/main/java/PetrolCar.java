public class PetrolCar extends Car {

    private double rentPrice;
    private double buyPrice;
    private double damage;

    public PetrolCar(Tyre tyres, EngineType engine, String color, String make, Boolean isRental, double cost) {
        super(tyres, engine, color, make, isRental, cost);
        this.rentPrice = 250;
        this.buyPrice = 30000;
        //this.damage = 0;
    }

//setter damage;

//
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



//    public void repair(double cost){
//        rentPrice += cost;
//        buyPrice += cost;
//        setDamage(0);
//    }

}
