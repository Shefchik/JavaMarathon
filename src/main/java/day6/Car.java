package main.java.day6;

public class Car {

    private String model;
    private String color;
    private int productionYear;

    public Car(){

    }

    public Car(String model, String color, int productionYear){
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear){
        return Math.abs(this.productionYear - inputYear);
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
