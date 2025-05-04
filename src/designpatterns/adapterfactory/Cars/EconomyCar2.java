package designpatterns.adapterfactory.Cars;

public class EconomyCar2 implements Cars {
    @Override
    public String getEvVehicle(String car) {
        return "Motocar "+car;
    }
}
