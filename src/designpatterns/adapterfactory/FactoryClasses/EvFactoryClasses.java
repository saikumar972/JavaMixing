package designpatterns.adapterfactory.FactoryClasses;

import designpatterns.adapterfactory.Cars.Cars;
import designpatterns.adapterfactory.Cars.LuxuryCar1;
import designpatterns.adapterfactory.Cars.LuxuryCar2;

public class EvFactoryClasses implements AbstractFactory {
   public  Cars getCarType(String EvCarType){
       switch (EvCarType){
           case "Iq": return new LuxuryCar1();
           case "Moto": return new LuxuryCar2();
           default: return null;
       }
   }
}
