package practice11;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> klass.appendTeacher(this));
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(classes == null)
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        else {
            String classesStr = classes.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", "));
            return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), classesStr);
        }
    }

    public void say(String message) {
        System.out.print(message);
    }

    public String introduceWith(Student student){
        if(isTeaching(student)){
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), student.getName());
        }else{
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
        }
    }

    public boolean isTeaching(Student student){
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }
}
