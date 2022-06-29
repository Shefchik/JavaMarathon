package day14;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "{name = " + name + ", age = " + age + "}";
    }
}

