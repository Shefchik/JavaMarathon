package main.java.day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(day6.Student student){
        Random random = new Random();
        int studentMark = random.nextInt(2, 5);

        String studentMarkWord = getWordMark(studentMark);

        System.out.println("Преподаватель " + this.name + " оценил"
                + " студента с именем " + student.getName()
                + " по предмету " + this.getSubject()
                + " на оценку " + studentMarkWord + ".");
    }

    private String getWordMark(int mark) {
        String result;
        switch (mark) {
            case 2:
                result = "неудовлетворительно";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 4:
                result = "хорошо";
                break;
            case 5:
                result = "отлично";
                break;
            default:
                result = "Оценка не установлена!";
                break;
        }
        return  result;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}
