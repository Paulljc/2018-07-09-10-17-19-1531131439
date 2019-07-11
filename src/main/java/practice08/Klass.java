package practice08;

public class Klass extends Person{
    private int number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass(int id, String name, int age, int number) {
        super(id, name, age);
        this.number = number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }

    public void assignLeader(Student student){
        leader = student;
    }
}
