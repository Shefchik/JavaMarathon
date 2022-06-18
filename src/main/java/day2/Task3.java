package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int FIVE_NUMBER = 5;
        final int TEN_NUMBER = 10;

        System.out.println("введите 1-е число: ");
        int firstNumber = Integer.parseInt(s.nextLine());

        System.out.println("введите 2-е число: ");
        int secondNumber = Integer.parseInt(s.nextLine());

        int currentNumber = firstNumber + 1;
        while( currentNumber < secondNumber){
            if(currentNumber%FIVE_NUMBER == 0 && currentNumber%TEN_NUMBER != 0){
                System.out.println("Подходящее число: " + currentNumber);
            }
            currentNumber++;
        }

    }
}
