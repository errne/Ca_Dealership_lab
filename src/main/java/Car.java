public abstract class Car {
    private EngineType engine;
    private Tyre tyres;
    private String color;
    private String make;
    private Boolean isRental;
    private double rentPrice;
    private double buyPrice;
    private double cost;
    private double damage;

    public Car(Tyre tyres, EngineType engine, String color, String make, Boolean isRental, double cost) {
        this.tyres = tyres;
        this.engine = engine;
        this.color = color;
        this.make = make;
        this.isRental = isRental;
//        this.rentPrice = 0;
//        this.buyPrice = 0;
        this.cost = cost;
        this.damage = 0;

    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public EngineType getEngine() {
        return engine;
    }

    public Tyre getTyres() {
        return tyres;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public Boolean getRental() {
        return isRental;
    }

    public double getRentPrice() {
        return rentPrice - damage;
    }

    public double getBuyPrice() {
        return buyPrice - damage;
    }

    public double getCost() {
        return cost;
    }

    public void repair(){
        //ouble oldPrice = getRentPrice();
        //rentPrice =  oldPrice + cost;
       // buyPrice =  oldPrice + cost;
        setDamage(0);
    }

    //this is adding it to abs car rent price which is 0
}
