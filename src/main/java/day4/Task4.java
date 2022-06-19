package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        final int N = 100;
        int[] intArray = new int[N];

        for (int index = 0; index < N; index ++){
            Random r = new Random();
            intArray[index] = r.nextInt( 10000);
            System.out.print(intArray[index]  + " ");
        }
        int maxSum = 0;
        int maxIndex = 0;
        int currentSum = 0;
        for (int index = 2; index < N; index++){
            currentSum += intArray[index] + intArray[index - 1] + intArray[index - 2];
            if (currentSum > maxSum){
                maxSum = currentSum;
                maxIndex = index - 2;
            }
            currentSum = 0;
        }
        System.out.println("maxIndex = " + maxIndex + " maxSum = " + maxSum);
    }
}
