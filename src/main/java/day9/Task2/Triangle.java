package day9.Task2;

public class Triangle extends Figure{
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }


    public double area(){
        double p = (firstSide + secondSide + thirdSide) / 2;

        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    public double perimeter(){
        return firstSide + secondSide + thirdSide;
    }

}
