package designpatterns.builder.builder1;

public class Student {
    private final int id;
    private final String name;
    private final String subject;
    private final double pocketMoney;
    private final String parent;

    private Student(StudentBuilder studentBuilder){
        this.id=studentBuilder.id;
        this.name=studentBuilder.name;
        this.subject=studentBuilder.subject;
        this.pocketMoney=studentBuilder.pocketMoney;
        this.parent=studentBuilder.parent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getPocketMoney() {
        return pocketMoney;
    }

    public String getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", pocketMoney=" + pocketMoney +
                ", parent='" + parent + '\'' +
                '}';
    }

    public static class StudentBuilder{
        private  int id;
        private  String name;
        private  String subject;
        private  double pocketMoney;
        private  String parent;
        public StudentBuilder setId(int id){
            this.id=id;
            return this;
        }
        public StudentBuilder setName(String name){
            this.name=name;
            return this;
        }
        public StudentBuilder setSubject(String subject){
            this.subject=subject;
            return this;
        }
        public StudentBuilder setPocketMoney(int pocketMoney){
            this.pocketMoney=pocketMoney;
            return this;
        }
        public StudentBuilder setParent(String parent){
            this.parent=parent;
            return this;
        }
        public Student studentBuild(){
            return new Student(this);
        }
    }

}
