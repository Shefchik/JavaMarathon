package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 100;

        int[] intArray = new int[NUMBER_OF_ELEMENTS];

        for(int index = 0; index < intArray.length; index++){
            Random randomInt = new Random();
            intArray[index] = randomInt.nextInt(0, 10000);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int zeroCount =0;
        int zeroSum = 0;
        for(int index = 0; index < intArray.length; index++){
            if(intArray[index] > max){
                max = intArray[index];
            }

            if(intArray[index] < min){
                min = intArray[index];
            }

            if (intArray[index]%10 == 0){
                zeroCount++;
                zeroSum +=intArray[index];
            }
        }

        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + zeroCount);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + zeroSum);


    }
}
