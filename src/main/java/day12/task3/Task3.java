package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bandsList = new ArrayList<>();

        bandsList.add(new MusicBand("Queen", 1971));
        bandsList.add(new MusicBand("Beatles", 1961));
        bandsList.add(new MusicBand("Aria", 1989));
        bandsList.add(new MusicBand("Metallica", 1978));
        bandsList.add(new MusicBand("Manowar", 1991));
        bandsList.add(new MusicBand("DDT", 1988));
        bandsList.add(new MusicBand("Kino", 1983));
        bandsList.add(new MusicBand("Scorpions", 1965));
        bandsList.add(new MusicBand("Roxette", 1974));
        bandsList.add(new MusicBand("Samocveti", 1977));
        bandsList.add(new MusicBand("Brainstorm", 2003));
        bandsList.add(new MusicBand("Basta", 2014));
        bandsList.add(new MusicBand("Green Day", 2010));
        Collections.shuffle(bandsList);
        printList(bandsList);
        List<MusicBand> after2000List= groupsAfter2000(bandsList);
        printList(after2000List);

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        int afterYear = 2000;
        List<MusicBand> afterList = new ArrayList<>();

        for(MusicBand item : bands){
            if (item.getYear() > afterYear ){
                afterList.add(item);
            }
        }
        return afterList;
    }

    public static void printList(List<MusicBand> list){
        for (MusicBand item : list){
            System.out.println(item);
        }
        System.out.println("\n");
    }
}
