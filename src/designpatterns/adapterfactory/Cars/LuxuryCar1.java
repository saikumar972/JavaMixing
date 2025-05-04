package designpatterns.adapterfactory.Cars;

public class LuxuryCar1 implements Cars {
    @Override
    public String getEvVehicle(String car) {
        return "IqCar is "+car;
    }
}
