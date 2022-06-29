package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String drPath = "src" + separator + "main" + separator + "resources";
        File inFile = new File(drPath +  separator + "shoes.csv");
        File outFile = new File(drPath +  separator + "missing_shoes.txt");

        List<Shoe> shoeList = getParseFileToObjectList(inFile);
        List<Shoe> shoeZeroCountList = new ArrayList<>();
        for(Shoe item : shoeList){
            if(item.getCount() == 0){
                shoeZeroCountList.add(item);
            }
        }
        printObjectsToFile(outFile, shoeZeroCountList);

    }
    public static void printObjectsToFile(File outFile, List<Shoe> shoesZeroCountList){
        try{
            PrintWriter pw = new PrintWriter(outFile);
            for(Shoe item : shoesZeroCountList){
                String rowToFile = item.getName() + ", " + item.getSize() + ", " + item.getCount();
                pw.println(rowToFile);
            }
            pw.close();
        }catch(FileNotFoundException e){
            System.out.println("Не могу записать в файл!");
        }
    }
    public static List<Shoe>  getParseFileToObjectList(File file){
        List<Shoe> shoeList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String[] lineElements = scanner.nextLine().split(";");
                shoeList.add(new Shoe(lineElements[0],
                                        Double.parseDouble(lineElements[1]),
                                        Integer.parseInt(lineElements[2])));
            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден!");
            return new ArrayList<>();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректный входной файл");
            return new ArrayList<>();
        }
        return  shoeList;
    }

}
