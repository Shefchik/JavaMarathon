package main.java.day6;

public class Airplane {

    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void fillUp(int n){
        this.fuel += n;
    }
    public void info(){
        System.out.println("Изготовитель: " + this.manufacturer
                + ", год выпуска: " + this.year
                + ", длина: " + this.length
                + ", вес: " + this.weight
                + ", количество топлива: " + this.fuel
                + ". ");
    }
    public double getFuel() {
        return fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

}
