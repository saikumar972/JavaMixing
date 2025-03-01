package enums;

public class EnumInterface {
    public static void main(String[] args) {
        Month month=Month.APRIL;
        System.out.println(month.impl());
    }
}
interface enumimpl{
    String impl();
}
enum Month implements enumimpl{
    JANUARY,
    FEBRAURAY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,DECEMBER;

    @Override
    public String impl() {
        return this.name().toLowerCase();
    }
}