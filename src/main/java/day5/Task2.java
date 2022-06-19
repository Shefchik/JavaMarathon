package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "red", 2005);
        System.out.println("Motorbike characteristics : model -" + motorbike.getModel()
                + ", color - " + motorbike.getColor() + ", production year  - " + motorbike.getProductionYear());
    }
}
class Motorbike {
    private String model;
    private String color;
    private int productionYear;

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

    public Motorbike(String model, String color, int productionYear){
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

}

