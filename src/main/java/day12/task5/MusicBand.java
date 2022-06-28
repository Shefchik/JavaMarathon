package day12.task5;



import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<MusicArtist> membersList;

    public  static  void transferMembers(MusicBand bandFrom, MusicBand bandTo){
        for(MusicArtist item : bandFrom.membersList){
            bandTo.membersList.add(item);
        }
        bandFrom.membersList.clear();
    }

    public  MusicBand(String name, int year, List<MusicArtist> membersList){
        this.name = name;
        this.year = year;
        this.membersList = membersList;
    }

    public void setMembers(List<MusicArtist> membersList) {
        this.membersList = membersList;
    }

    public String getMembers() {
        String output = "";
        for(MusicArtist item : membersList){
            output += item + ", ";
        }
        return output.length() != 0 ? output.substring(0, output.length() - 2) : "";
    }

    public void printMembers(){
        System.out.println(getMembers());
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "MusicBand {name = " + name +", year = " + year + ", " + getMembers() + "}";
    }
}
