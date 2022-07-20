package day19.task2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static HashMap<Integer, Point> mapTaxi;
    public static int x1, y1, x2, y2;
    public static void main(String[] args) {
        LoadTaxiCars("taxi_cars.txt");
        //mapTaxi.entrySet().stream().map(o -> o.getValue()).forEach(System.out::println);
        enterCoordinates();
        listAppropriatePoints();
    }
    public static void listAppropriatePoints(){
        mapTaxi.entrySet().stream().filter(o -> (x1 <= o.getValue().getX() && o.getValue().getX() <= x2)
                                                    && (y2 <= o.getValue().getY() && o.getValue().getY() <= y1)).forEach(System.out::println);
    }
    public static void enterCoordinates(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x1 : ");
        x1 = scanner.nextInt();
        System.out.print("Введите y1 : ");
        y1 = scanner.nextInt();
        System.out.print("Введите x2 : ");
        x2 = scanner.nextInt();
        System.out.print("Введите y2 : ");
        y2 = scanner.nextInt();
    }
    public static void LoadTaxiCars(String file){
        String separator = File.separator;
        String drPath = "src" + separator + "main" + separator + "resources";
        List<String> lines = readFile(drPath + separator + file);
        mapTaxi= ConvertStringListToHashMap(lines);
    }
    public static List<String> readFile(String file){
        try{
            return  new ArrayList<>(Files.readAllLines(Paths.get(file)));
        }catch(Exception ex){
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static HashMap<Integer, Point> ConvertStringListToHashMap(List<String> lines){
        HashMap<Integer, Point> map = new HashMap<>();
        for(String entry : lines){
            String[] elements = entry.split(" ");
            map.put(Integer.parseInt(elements[0]), new Point(Integer.parseInt(elements[1]), Integer.parseInt(elements[2])));
        }
        return map;
    }
}

