package day7;


public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 1999, 45.4, 60.6);
        Airplane airplane2 = new Airplane("Airbus", 2017, 47.4, 60.6);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}