package day9.Task1;

import day6.Student;

public class Teacher extends Human{
    private final String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(this);
    }

    public String toString(){
        return "Этот преподаватель с именем " + this.getName();
    }

    public String getSubjectName() {
        return subjectName;
    }


    public void evaluate(Student student) {
    }
}
