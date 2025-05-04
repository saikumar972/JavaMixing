package designpatterns.adapterfactory.Cars;

public class LuxuryCar2 implements Cars {
    @Override
    public String getEvVehicle(String car) {
        return "Motocar "+car;
    }
}
