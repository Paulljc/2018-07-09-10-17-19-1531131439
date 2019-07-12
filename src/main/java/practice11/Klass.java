package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private String displayName;
    private Student leader;
    private List<Teacher> teachers;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + number;
        this.teachers = new ArrayList<>();
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student student) {
        if (this.number.equals(student.getKlass().number)) {
            this.leader = student;
            teachers.forEach(teacher -> teacher.say(String.format("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), number)));
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        teachers.forEach(teacher -> teacher.say(String.format("I am %s. I know %s has joined Class %s.\n", teacher.getName(), student.getName(), number)));
    }
}
