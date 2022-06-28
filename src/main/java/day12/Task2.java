package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        int min = 0;
        int max = 30;
        createEvenNumbersList(min, max, integerList);
        printList(integerList);

        integerList.clear();
        min = 300;
        max = 350;
        createEvenNumbersList(min, max, integerList);
        printList(integerList);


    }

    public static void createEvenNumbersList(int min, int max, List<Integer> integerList){
        final int divider = 2;
        for(int index = min; index < max; index++){
            if (index%2== 0){
                integerList.add(index);
            }
        }

    }

    public static void printList(List<Integer> list){
        for (Integer item : list){
            System.out.println(item);
        }
        System.out.println("\n");
    }
}
