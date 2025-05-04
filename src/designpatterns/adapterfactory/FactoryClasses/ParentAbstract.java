package designpatterns.adapterfactory.FactoryClasses;

public class ParentAbstract {
    public AbstractFactory getCarTypeFactory(String factory){
        switch (factory){
            case "Luxury" : return new EvFactoryClasses();
            case "Economic": return new LuxuryFactoryClasses();
            default: return null;
        }
    }
}
