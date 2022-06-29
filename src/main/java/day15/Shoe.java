package day15;

public class Shoe {
    private final String name;
    private final double size;
    private final int count;


    public Shoe(String name, double size, int count) {
        this.name = name;
        this.size = size;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }
}
