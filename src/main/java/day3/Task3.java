package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int ITERATIONS_NUMBER = 5;
        double divisible;
        double divider;
        double result;
        for (int index = 0; index < ITERATIONS_NUMBER; index++) {
            System.out.print("Введите делимое и делитель в одну строчку: ");
            divisible = s.nextDouble();
            divider = s.nextDouble();

            switch((int)divider) {
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
            }

            result = divisible / divider;
            System.out.println(result);

        }
    }
}
