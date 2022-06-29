package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<Person> parsedFileList = parseFileToObjList(file);
        for (Person item : parsedFileList){
            System.out.println(item);
        }
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String[] stringNames;
                String line = scanner.nextLine();
                stringNames = line.split(", ");
                for (String item  : stringNames){

                    String[] personInfo = item.split(" ");
                    int age = Integer.valueOf(personInfo[1]);
                    if(age < 0 ){
                        throw  new IOException();
                    }
                    personList.add(new Person(personInfo[0], age));
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

        return personList;
    }
}

