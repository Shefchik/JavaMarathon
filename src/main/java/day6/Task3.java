package day6;

import day6.Student;
import day9.Task1.Teacher;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Николай Петрович", "Физика");
        Student student = new Student("Виктор");
        teacher.evaluate(student);
    }
}