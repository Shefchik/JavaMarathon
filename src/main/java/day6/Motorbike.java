package main.java.day6;

public class Motorbike {
    private String model;
    private String color;
    private int productionYear;

    void info(){
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear){
        return Math.abs(this.productionYear - inputYear);
    }

    public Motorbike(String model, String color, int productionYear){
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
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

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

}

