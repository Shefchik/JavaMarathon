package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printResult(file);
    }

    public static void printResult(File file){
        try{
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            scanner.close();
            double result = Arrays.stream(line.split(" ")).mapToDouble(Double :: parseDouble)
                                                                                    .average().getAsDouble();

            System.out.printf("%.15f-->%.3f", result, result);
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch (NoSuchElementException e){
            System.out.println("Отсутствует значение в объекте OptionalDouble");
        }

    }
}

