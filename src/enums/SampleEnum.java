package enums;
class EnumMain{
    public static void main(String[] args) {
        SampleEnum e=SampleEnum.SUNDAY;
        System.out.println(e.ordinal());
        System.out.println(e.name());
        System.out.println(e.hashCode());
        System.out.println();
        for(SampleEnum e1:SampleEnum.values()){
            System.out.println(e1.ordinal());
        }
        SampleEnum e3=SampleEnum.valueOf("saturday");
        System.out.println(e3.name());
    }
}
public enum SampleEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    saturday,
    SUNDAY;
}
