package day9.Task1;

public class Human {
    private final String name;

    public void printInfo(){
        System.out.println("Этот человек с именем " + name);
    }
    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }
}
