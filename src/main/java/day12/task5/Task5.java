package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> bandFromMembers = new ArrayList<>();
        bandFromMembers.add(new MusicArtist("Roger Taylor", 78));
        bandFromMembers.add(new MusicArtist("Brian May", 76));
        MusicBand bandFrom = new MusicBand("Queen", 1971, bandFromMembers);


        List<MusicArtist> bandToMembers = new ArrayList<>();
        bandToMembers.add(new MusicArtist("John Lennon", 43));
        bandToMembers.add(new MusicArtist("Paul McCartney", 83));
        bandToMembers.add(new MusicArtist("George Harrison", 85));
        bandToMembers.add(new MusicArtist("Ringo Starr", 81));

        MusicBand bandTo = new MusicBand("Beatles", 1961, bandToMembers);
        System.out.println("Before Merge");
        bandTo.printMembers();
        MusicBand.transferMembers(bandFrom, bandTo);
        System.out.println("After Merge");
        bandTo.printMembers();
        System.out.println("Old band members:");
        bandFrom.printMembers();
    }
}
