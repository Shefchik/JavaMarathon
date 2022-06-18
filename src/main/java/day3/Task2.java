package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double divisible;
        double divider;
        double result;
        while (true){
            System.out.print("Введите делимое и делитель в одну строчку: ");
            divisible = s.nextDouble();
            divider = s.nextDouble();

            if (divider == 0) {
                break;
            }
            result = divisible / divider;
            System.out.println(result);
        }
    }
}
