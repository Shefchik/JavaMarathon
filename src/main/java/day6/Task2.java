package main.java.day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1999, 45.4, 60.6);
        airplane.info();
        airplane.setYear(2002);
        airplane.setLength(50.1);
        airplane.fillUp(12);
        airplane.info();
        airplane.fillUp(23);
        airplane.info();
    }
}
