package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> bandFromMembers = new ArrayList<>();
        bandFromMembers.add("Roger Taylor");
        bandFromMembers.add("Brian May");
        MusicBand bandFrom = new MusicBand("Queen", 1971, bandFromMembers);


        List<String> bandToMembers = new ArrayList<>();
        bandToMembers.add("John Lennon");
        bandToMembers.add("Paul McCartney");
        bandToMembers.add("George Harrison");
        bandToMembers.add("Ringo Starr");
        MusicBand bandTo = new MusicBand("Beatles", 1961, bandToMembers);
        System.out.println("Before Merge");
        bandTo.printMembers();
        MusicBand.transferMembers(bandFrom, bandTo);
        System.out.println("After Merge");
        bandTo.printMembers();


    }
}
