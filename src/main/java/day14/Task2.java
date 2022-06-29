package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<String> parsedFileList = parseFileToStringList(file);
        for (String item : parsedFileList){
            System.out.println(item);
        }
    }
    public static List<String> parseFileToStringList(File file){
        List<String> namesAgesList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String[] stringNames;
                String line = scanner.nextLine();
                stringNames = line.split(", ");
                for (String item  : stringNames){

                    String[] nameInfo = item.split(" ");
                    if(Integer.valueOf(nameInfo[1]) < 0 ){
                        throw  new IOException();
                    }

                    namesAgesList.add(item);
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch(IOException e){
            System.out.println("“Некорректный входной файл!");
            return new ArrayList<>();
        }

        return namesAgesList;

    }
}

