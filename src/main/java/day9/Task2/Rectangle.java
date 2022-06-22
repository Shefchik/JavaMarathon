package day9.Task2;

public class Rectangle extends Figure{
    private final double width;
    private final double height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        return  width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

}
