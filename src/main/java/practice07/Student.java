package practice07;

public class Student extends Person{

    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(String name, int age) {
        super(name, age);
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("%1$s I am a Student. I am at %2$s.",super.introduce(), klass.getDisplayName());
    }
}
