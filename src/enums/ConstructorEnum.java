package enums;


public  enum ConstructorEnum {
    MONDAY(1,"1st day of the month"),
    TUESDAY(2,"2nd day of the month"),
    WEDNESDAY(3,"3rd day of the month"),
    THURSDAY(4,"4th day of the month"),
    FRIDAY(5,"5th day of the month"),
    SATURDAY(6,"6th day of the month"),
    SUNDAY(7,"7th day of the month");
    private int id;
    private String name;
    ConstructorEnum(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static ConstructorEnum methodd(int id) {
        for (ConstructorEnum e : ConstructorEnum.values()) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}
