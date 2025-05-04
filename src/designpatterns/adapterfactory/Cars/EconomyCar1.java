package designpatterns.adapterfactory.Cars;

public class EconomyCar1 implements Cars {
    @Override
    public String getEvVehicle(String car) {
        return "IqCar is "+car;
    }
}
