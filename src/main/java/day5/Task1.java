package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Nissan");
        car.setColor("blue");
        car.setProductionYear(1998);

        System.out.println("Car characteristics: model - " + car.getModel() + ", color - " + car.getColor()
                + ", production year -" + car.getProductionYear() + ". ");

    }
}

class Car {

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