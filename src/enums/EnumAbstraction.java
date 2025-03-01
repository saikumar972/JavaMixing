package enums;

public class EnumAbstraction {
    public static void main(String[] args) {
        SampledEnum ee=SampledEnum.FRIDAY;
        ee.edo();
    }
}
enum SampledEnum{
    MONDAY {
        @Override
        void edo() {
            System.out.println("1st day");
        }
    },
    TUESDAY {
        @Override
        void edo() {
            System.out.println("2nd day");
        }
    },
    WEDNESDAY {
        @Override
        void edo() {
            System.out.println("3rd day");
        }
    },
    THURSDAY {
        @Override
        void edo() {
            System.out.println("4th day");
        }
    },
    FRIDAY {
        @Override
        void edo() {
            System.out.println("5th day");
        }
    };
    abstract void edo();
}
