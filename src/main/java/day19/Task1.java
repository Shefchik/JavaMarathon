package day19;

import java.io.File;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        final int TOP_100 = 100;
        String separator = File.separator;
        String drPath = "src" + separator + "main" + separator + "resources";
        File file = new File(drPath + separator + "dushi.txt");

        TreeSet<Word> wordsTreeSet;

        AtomicInteger count = new AtomicInteger(0);

        wordsTreeSet = readFileToTreeSet(file);

        wordsTreeSet.descendingSet().stream()
                            .filter(p -> count.incrementAndGet() <= TOP_100)
                            .map(p-> "слово: \"" + p.getName() + "\" кол-во: \"" + p.getCount() + "\"")
                            .forEach(System.out::println);

        wordsTreeSet.stream().filter(o -> o.getName().equals("Чичиков"))
                                                .map(o ->" Слово \"Чичиков\" встречается " + o.getCount() + " раз")
                                                .forEach(System.out::println);
    }

    public static TreeSet<Word> readFileToTreeSet(File file){

        Map<String, Integer> map = new HashMap<>();
        try{
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while(scanner.hasNext()){
                String readWord = scanner.next();
                int counter = (map.get(readWord) != null) ? map.get(readWord) + 1 : 1;
                if (readWord.matches("[а-яёА-ЯЁ]+")) {
                    map.put(readWord, counter);
                }
            }
            scanner.close();
            TreeSet<Word> words = new TreeSet<>();

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                words.add(new Word(entry.getKey(), entry.getValue()));
            }
            return words;

        }catch(Exception ex){
            ex.printStackTrace();
            return new TreeSet<>();
        }

    }

}
