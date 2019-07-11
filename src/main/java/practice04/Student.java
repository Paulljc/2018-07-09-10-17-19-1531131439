package practice04;

public class Student extends Person{

    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("My name is %1$s. I am %2$d years old. I am a Student. I am at Class %3$d.",this.getName(), this.getAge(), this.klass);
    }
}
