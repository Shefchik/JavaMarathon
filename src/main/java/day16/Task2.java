package day16;

import day15.Shoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    final static int DIGITS_AVG = 20;
    public static void main(String[] args) {
        String separator = File.separator;
        String drPath = "src" + separator + "main" + separator + "resources";
        File outFile1 = new File(drPath +  separator + "file1.txt");
        File outFile2 = new File(drPath +  separator + "file2.txt");
        //Generate random numbers
        List<Integer> integersList = getGeneratedRandomNumbers(1000, 0, 100);
        //write these numbers to the file
        printObjectsToFile(outFile1, integersList);
        //read from file with integers but in string format, count = 1000
        List<String> stringList = readFromFile(outFile1);

        //convert to integers list
        integersList = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
        //get avg of every twenty numbers
        List<Double> doubleList = getAVGForEveryTwentyNumbers(integersList);
        //print avg to file, supposed to be 50 double numbers
        printObjectsToFile(outFile2, doubleList);
        //print on the screen sum result
        printResult(outFile2);
    }

    public static void printResult(File file){
        List<String> stringList = readFromFile(file);
        //convert to integers list
        List<Double> doubleList = stringList.stream().map(Double::parseDouble).collect(Collectors.toList());
        System.out.println((int)(doubleList.stream().mapToDouble(s -> s).sum()));
    }
    public static  List<String> readFromFile(File file){
        List<String> stringList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringList.add(scanner.nextLine());
            }
            scanner.close();
            return stringList;
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден!");
            return new ArrayList<>();
        }
    }
    public static List<Double> getAVGForEveryTwentyNumbers(List<Integer> numbersList){
        List<Double> doublesList = new ArrayList<>();
        int numbersSum = 0;
        for(int index = 0; index < numbersList.size(); index++ ){
            numbersSum += numbersList.get(index);
            if(index%DIGITS_AVG == 0){
                doublesList.add((double)numbersSum/DIGITS_AVG);
                numbersSum = 0;
            }
        }
        return doublesList;
    }
    public static void printObjectsToFile(File outFile, List<?> numbersList){
        try{
            PrintWriter pw = new PrintWriter(outFile);


            for (Object o : numbersList) {
                pw.println(o);
            }
            pw.close();
        }catch(FileNotFoundException e){
            System.out.println("Файл для записи не найден!");
        }
    }
    public static List<Integer> getGeneratedRandomNumbers(int numbersCount, int randomLowerLimit, int randomUpperLimit){
        List<Integer> randomNumbersList = new ArrayList<>();
        for(int index = 0; index < numbersCount; index++){
            Random random = new Random();
            randomNumbersList.add(random.nextInt(randomUpperLimit - randomLowerLimit) + randomLowerLimit);
        }
        return randomNumbersList;
    }
}
