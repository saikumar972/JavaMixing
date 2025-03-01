package enums;

public class ConstructorMain {
    public static void main(String[] args) {
        ConstructorEnum e=ConstructorEnum.methodd(4);
        System.out.println(e.getName());
        System.out.println(e);
        System.out.println(e.ordinal());
    }
}
