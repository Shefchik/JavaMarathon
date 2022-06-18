package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        final double FIVE_NUMBER = 5;
        final double MINUS_THREE_NUMBER = -3;
        final double DEFAULT_NUMBER = 420;

        Scanner s = new Scanner(System.in);
        double yNumber;

        System.out.print("введите X: ");
        double xNumber = s.nextDouble();

        if (xNumber >= FIVE_NUMBER){
            yNumber = (Math.pow(xNumber, 2) - 10) / (xNumber + 7);
        }else if(MINUS_THREE_NUMBER <= xNumber && xNumber < FIVE_NUMBER){
            yNumber = (xNumber + 3) * (Math.pow(xNumber, 2) - 2);
        }else {
            yNumber = DEFAULT_NUMBER;
        }
        System.out.println(yNumber);
    }
}
