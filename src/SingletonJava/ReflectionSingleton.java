package SingletonJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException,CloneNotSupportedException {
        ReflectionSample ref=ReflectionSample.getInstance();
        System.out.println("real "+ref.hashCode());
        //cloning
        try{
            ReflectionSample sample=(ReflectionSample)ref.clone();
            System.out.println(sample.hashCode());
        }catch (Exception e){
            System.out.println("clone exception caught");
        }

        //reflection
        Constructor[] constructorList=ReflectionSample.class.getDeclaredConstructors();
        for(Constructor c:constructorList){
            c.setAccessible(true);
            ReflectionSample ref2= (ReflectionSample) c.newInstance();
            System.out.println("reflection "+ref2.hashCode());
        }

    }
}
class ReflectionSample extends SampleCloning{
    public static  ReflectionSample ref;
    private ReflectionSample(){
        if(ref!=null){
            throw new RuntimeException("reflection nt worked ");
        }
    }
    //to overcome clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException("cloning nt possible");
    }
    public static synchronized ReflectionSample getInstance(){
        if(ref==null){
            ref=new ReflectionSample();
        }
        return ref;
    }
}

class SampleCloning implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
