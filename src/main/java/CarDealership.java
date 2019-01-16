import java.util.ArrayList;

public class CarDealership {
    private String name;
    private ArrayList<Car>cars;
    private double till;

    public CarDealership(String name) {
        this.name = name;
        this.cars = new ArrayList<Car>();
        this.till = 100000;
    }

    public String getName() {
        return name;
    }

    public int getCarCount() {
        return cars.size();
    }

    public double getTill() {
        return till;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public void buyCar(Car car){
        if(getTill() >= car.getCost()){
            removeFromTill(car.getCost());
            addCar(car);
        }
    }



    public void sellOrRentCar(Car car){
        till += getCarPrice(car);
        cars.remove(car);
    }

    public void addToTill(double money){
        till += money;
    }

    public void removeFromTill(double money){
        till -= money;
    }

    public double getCarPrice(Car pcar) {
        double price = 0.0;
        for (Car car : cars){
            if (car == pcar){
                if(car.getRental()){
                    price = car.getRentPrice();
                } else {
                   price = car.getBuyPrice();
                }
            }
        }
        return price;
    }

    public void repairCar(Car car){
        double repairCost = car.getDamage();
        till -= repairCost;
        //pcar.repair(repairCost);
        car.repair();
    }
}
