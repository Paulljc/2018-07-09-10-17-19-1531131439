package practice07;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return String.format("%1$s I am a Teacher. I teach No Class.",super.introduce());
        } else {
            return String.format("%1$s I am a Teacher. I teach %2$s.",super.introduce(), this.klass.getDisplayName());
        }

    }

    public String introduceWith(Student student) {
        if (student.getKlass() == klass){
            return String.format("%1$s I am a Teacher. I teach %2$s.", super.introduce(), student.getName());
        }else {
            return String.format("%1$s I am a Teacher. I don't teach %2$s.", super.introduce(), student.getName());
        }
    }
}
