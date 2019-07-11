package practice06;

public class Teacher extends Person{

    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return String.format("%1$s I am a Teacher. I teach No Class.",super.introduce());
        } else {
            return String.format("%1$s I am a Teacher. I teach Class %2$d.",super.introduce(), this.klass);
        }
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
