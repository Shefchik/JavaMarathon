package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        final int M = 12;
        final int N = 8;
        int[][] matrix = new int[M][N];
        int maxIndexY = 0;
        int maxSum = 0;
        int currentRowSum;

        for (int indexY = 0; indexY < matrix.length; indexY++){
            currentRowSum = 0;
            for (int indexX = 0; indexX < matrix[indexY].length; indexX++){
                Random r =new Random();
                matrix[indexY][indexX] = r.nextInt(0,50);
                currentRowSum += matrix[indexY][indexX];
                System.out.print(matrix[indexY][indexX] + " ");
            }
            if (maxSum < currentRowSum){
                maxSum = currentRowSum;
                maxIndexY = indexY;
            }
            System.out.println("");
        }
        System.out.println("final maxIndexY = " + maxIndexY + " maxSum = " + maxSum);
    }
}
