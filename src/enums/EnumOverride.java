package enums;

public class EnumOverride {
    public static void main(String[] args) {
        OverrideEnum ee=OverrideEnum.MONDAY;
       ee.sample();
        OverrideEnum ee2=OverrideEnum.THURSDAY;
        ee2.sample();
    }
}
enum OverrideEnum{
    MONDAY{
        public void sample(){
            System.out.println("monday override");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY;
    public void sample(){
        System.out.println("default");
    }
}