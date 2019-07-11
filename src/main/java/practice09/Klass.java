package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.println("It is not one of us.");
        } else{
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.println("It is not one of us.");
        } else {
            assignLeader(student);
        }
    }

    public Klass() {
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
}
