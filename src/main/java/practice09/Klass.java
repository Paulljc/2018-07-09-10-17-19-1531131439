package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.print("It is not one of us.\n");
        } else{
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.print("It is not one of us.\n");
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
