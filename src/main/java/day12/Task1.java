package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoBrandsList = new ArrayList<>();
        autoBrandsList.add("BMW");
        autoBrandsList.add("MERCEDES");
        autoBrandsList.add("KIA");
        autoBrandsList.add("SKODA");
        autoBrandsList.add("LADA");

        printList(autoBrandsList);
        int listMiddleSize = autoBrandsList.size()/2;
        autoBrandsList.add(listMiddleSize, "VOLKSWAGEN");
        printList(autoBrandsList);
        autoBrandsList.remove(0);
        printList(autoBrandsList);

    }

    public static void printList(List<String> listStrings){
        for (String item : listStrings){
            System.out.println(item);
        }
        System.out.println("\n");
    }
}
