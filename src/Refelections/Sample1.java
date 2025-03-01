package Refelections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Sample1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> c=Eagle.class;
        //System.out.println(c.getModifiers());
        System.out.println(c.getName());
        //to get class name
        System.out.println(c.getSimpleName());
        System.out.println("---------------------");
        //for public only
        //Method[] methods=c.getMethods();
        Method[] methods=c.getDeclaredMethods();
        for(Method m: methods){
            System.out.println(m.getName());
            System.out.println(m.getDeclaringClass().getSimpleName());
            System.out.println(m.getReturnType());
        }
        System.out.println("----------------------");
        //for setting fields
        Class<Eagle> EagleClass=Eagle.class;
        Field[] fields=EagleClass.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
        }
        System.out.println("---------------------------------");
        //setting private variables
        Class<?> birdClass = Bird.class;
        Bird bird = new Bird();
        Field f = birdClass.getDeclaredField("name");
        f.setAccessible(true); // Allow access to private field
        f.set(bird, "eagle");   // Set private field value name="eagle"
        System.out.println(f.get(bird));
        if ("name".equals(f.getName())) {
            System.out.println("asfbjsdfb");
        }

        System.out.println("---------------------------------");
        //invoking method
        //Class c1=Eagle.class;
        //Eagle= (Eagle) c1.newInstance();
        //since constructor is of type private we vae to do like this
        Class k=Eagle.class;
        Constructor<Eagle> constructor = k.getDeclaredConstructor();
        constructor.setAccessible(true);  // Bypass the private access check
        Eagle eagle = constructor.newInstance();
        Method mm=eagle.getClass().getMethod("m1",String.class);
        System.out.println(mm.invoke(eagle,"Nanda"));
        //here setting field if class having private constructor
        System.out.println("---------------------------------");
        Constructor<Eagle> cc=Eagle.class.getDeclaredConstructor();
        cc.setAccessible(true);
        Eagle obj=cc.newInstance();
        Class EagleClasss=Eagle.class;
        Field ff=EagleClasss.getDeclaredField("name");
        ff.setAccessible(true);
        ff.set(obj,"Eagle eagle");
        System.out.println(ff.get(obj));
    }
}
class Eagle{
    public int id;
    private String name;
    private Eagle(){
        System.out.println("private wall");
    }

    public String m1(String k){
        System.out.println("edo");
        return k;
    }
    private void m2(){
        System.out.println("edo vocation");
    }
}
class Bird{
    public int id;
    private String name;
    public Bird(){
        System.out.println("public wall");
    }

    public String m1(String k){
        System.out.println("edo");
        return k;
    }
    private void m2(){
        System.out.println("edo vocation");
    }
}