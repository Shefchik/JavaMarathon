package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Петров Петр Васильевич", "ПМИ-1977");
        System.out.println("Нзавание группы студента: " + student.getGroupName());
        Teacher teacher = new Teacher("Васильков Александр Маркович", "Высшая математика");
        System.out.println("Название предмета преподавателя: " + teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
