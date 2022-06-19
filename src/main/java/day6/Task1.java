package main.java.day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike mtrBike = new Motorbike("Yamaha", "blue", 1981);
        mtrBike.info();
        System.out.println(mtrBike.yearDifference(1998));

        Car car = new Car("Nissan", "red", 2000);
        car.info();
        System.out.println(car.yearDifference(1998));

    }
}
