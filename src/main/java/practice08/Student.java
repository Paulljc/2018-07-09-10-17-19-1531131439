package practice08;

public class Student extends Person{

    private int id;
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this == klass.getLeader()){
            return String.format("%1$s I am a Student. I am Leader of %2$s.",super.introduce(), klass.getDisplayName());
        }else{
            return String.format("%1$s I am a Student. I am at %2$s.",super.introduce(), klass.getDisplayName());
        }
    }
}
