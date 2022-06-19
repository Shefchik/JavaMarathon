package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int numberOfElements;
        Scanner s = new Scanner(System.in);

        System.out.print("введите количество элементов в массиве: ");

        numberOfElements = s.nextInt();

        int[] intArray = new int[numberOfElements];

        for (int index = 0; index < intArray.length; index++){
            Random randomInt = new Random();
            intArray[index]= randomInt.nextInt(10);
        }

        System.out.println(Arrays.toString(intArray));

        int moreThanEight = 0;
        int equalToOne = 0;
        int evenNumber = 0;
        int notEvenNumber = 0;
        int numberSum = 0;
        for (int index = 0; index < intArray.length; index++){

            if(intArray[index] > 8){
                moreThanEight++;
            }

            if(intArray[index] == 0){
                equalToOne++;
            }

            if(intArray[index]%2 == 0){
                evenNumber++;
            }

            if(intArray[index]%2 != 0){
                notEvenNumber++;
            }

            numberSum +=intArray[index];
        }

        System.out.println("Длина массива: " + intArray.length);
        System.out.println("Количестве чисел больше 8: " + moreThanEight);
        System.out.println("Количестве чисел равных 1: " + equalToOne);
        System.out.println("Количестве четных чисел: " + evenNumber);
        System.out.println("Количестве нечетных чисел: " + notEvenNumber);
        System.out.println("Сумма всех элементов массива: " + numberSum);

    }
}
