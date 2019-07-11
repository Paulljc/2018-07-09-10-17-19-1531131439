package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student() {
    }

    @Override
    public String introduce() {
        if (klass.getLeader() != null && klass.getLeader().getId() == super.getId()) {
            return String.format("%1$s I am a Student. I am Leader of %2$s.", super.introduce(), this.klass.getDisplayName());
        }else {
            return String.format("%1$s I am a Student. I am at %2$s.",super.introduce(), klass.getDisplayName());
        }
    }
}
