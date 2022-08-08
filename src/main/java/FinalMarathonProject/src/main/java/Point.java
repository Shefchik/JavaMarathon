package FinalMarathonProject.src.main.java;

public class Point {
    private final int x;
    private final int y;
    private boolean isWounded;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        isWounded = false;
    }

    public void setWounded(boolean wounded) {
        isWounded = wounded;
    }

    public boolean isWounded() {
        return isWounded;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }
    @Override
    public String toString(){
        return  "X = " + x + ", Y = " + y;
    }
    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
