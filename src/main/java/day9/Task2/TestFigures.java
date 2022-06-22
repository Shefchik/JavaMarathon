package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        String output = String.format("red figures perimeter = %.2f", calculateRedPerimeter(figures));
        System.out.println(output);
        output = String.format("red figures area = %.2f", calculateRedArea(figures));
        System.out.println(output);
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double resultPerimeter = 0;
        for(Figure item : figures) {
            if(item.getColor().equals("Red")){
                resultPerimeter += item.perimeter();
            }
        }
        return resultPerimeter;
    }
    public static double calculateRedArea(Figure[] figures){
        double resultArea = 0;
        for(Figure item : figures) {
            if(item.getColor().equals("Red")){
                resultArea += item.area();
            }
        }
        return resultArea;
    }

}
