package day14;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);
    }

    public static  void printSumDigits(File file) {
        final int DIGITS_COUNT = 10;

        try{
            int[] intNumbers = new int[DIGITS_COUNT];

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringNumbers;

            stringNumbers = line.split(" ");

            for(int index = 0; index < stringNumbers.length; index++){
                intNumbers [index] = Integer.valueOf(stringNumbers[index]);
            }

            System.out.println("Сумма чисел = " + Arrays.stream(intNumbers).sum());
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректный входной файл");
        }



    }
}
