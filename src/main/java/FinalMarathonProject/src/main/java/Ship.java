package FinalMarathonProject.src.main.java;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Ship {
    private static final int MAX_DECKS = 4;
    public static final int MAX_COORDINATE = 9;
    public static final int MIN_COORDINATE = 0;
    private final int numberOfDecks;
    private List<Point> deckPoints;
    private List<Point> haloPoints;

    private boolean destroyed;
    public Ship(int numberOfDecks){
        try {
            if (numberOfDecks > MAX_DECKS) {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException ex){
            System.out.println("Количество палуб не может превышать " + MAX_DECKS + "!");
            this.numberOfDecks = 0;
            return;
        }
        this.numberOfDecks = numberOfDecks;
        deckPoints = new ArrayList<>();
        haloPoints = new ArrayList<>();

    }

    public void setUpShip(List<Point> hPoints){
        copyAllHaloPointsToCurrent(hPoints);
        setDecksPoints();
        setHaloPoints();
    }
    private void copyAllHaloPointsToCurrent(List<Point> hPoints){
        haloPoints = hPoints;
    }
    private void setHaloPoints(){
        //make sure that halo points of previous ships are taken into account
        for (Point deckPoint : deckPoints) {
            //get coordinates of the ship deck
            int currentPointX = deckPoint.getX();
            int currentPointY = deckPoint.getY();
            //get halo of the deck Point
            int startPointX = Math.max((currentPointX - 1), MIN_COORDINATE);
            int startPointY = Math.max((currentPointY - 1), MIN_COORDINATE);
            int endPointX = Math.min((currentPointX + 1), MAX_COORDINATE);
            int endPointY = Math.min((currentPointY + 1), MAX_COORDINATE);

            //set halo around the deck point
            for (int indexX = startPointX; indexX <= endPointX; indexX++) {
                for (int indexY = startPointY; indexY <= endPointY; indexY++) {
                    Point pointToAdd = new Point(indexX, indexY);
                    if (!isPointPresentInList(pointToAdd, haloPoints)) {
                        haloPoints.add(pointToAdd);
                    }
                }
            }
        }
    }
    private void setDecksPoints(){
        String format = "x,y";
        String delimiter = ";";
        String formatDelimiter = format + delimiter;
        String resultFormat;

        switch (numberOfDecks){
            case 1:
                resultFormat = format;
                break;
            case 2:
                resultFormat = formatDelimiter + format;
                break;
            case 3:
                resultFormat = formatDelimiter + formatDelimiter + format;
                break;
            case 4:
                resultFormat = formatDelimiter + formatDelimiter + formatDelimiter + format;
                break;
            default:
                resultFormat = "";

        }
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координаты " + numberOfDecks + " палубного корабля(формат: " + resultFormat + ")");
            String input = scanner.next();
            String[] coords = input.split(";");
            for(String entry : coords){
                String[] xy = entry.split(",");
                deckPoints.add(new Point(Integer.parseInt(xy[0]),Integer.parseInt(xy[1])));
            }
        }catch (Exception ex){
            System.out.println("Формат введения координат не корректен!");
        }


        if(!isValidShip()){
            deckPoints.clear();
            setDecksPoints();
        }

    }

    private boolean isValidShip(){

        return isValidNumberOfDecks() && isValidPoints() && isConsistentLineXY() && isValidHaloPoints();
    }
    private boolean isValidNumberOfDecks(){
        if(numberOfDecks != deckPoints.size()){
            System.out.println("Количество палуб не соответствует кол-ву введенных координат!");
            return false;
        }
        return true;
    }
    private boolean isConsistentLineXY(){
        final int step = 1;
        List<Point> deckPointsXsorted = deckPoints.stream()
                                            .sorted(Comparator.comparing(Point::getX)).collect(Collectors.toList());
        List<Point> deckPointsYsorted = deckPoints.stream()
                                            .sorted(Comparator.comparing(Point::getY)).collect(Collectors.toList());

        int firstLineX = deckPoints.get(0).getX();
        int firstLineY = deckPoints.get(0).getY();

        for(int index = 1; index < deckPoints.size();index++){
            //check if it is either horizontal or vertical line and points go one after another
            boolean consistentLineX = deckPoints.get(index).getY() == firstLineY &&
                        Math.abs(deckPointsXsorted.get(index).getX() - deckPointsXsorted.get(index - 1).getX()) == step;
            boolean consistentLineY = deckPoints.get(index).getX() == firstLineX &&
                        Math.abs(deckPointsYsorted.get(index).getY() - deckPointsYsorted.get(index - 1).getY()) == step;

            if(!(consistentLineX || consistentLineY)){
                System.out.println("Корабль неправильной формы!");
                return false;
            }
        }
        return true;
    }
    private boolean isValidHaloPoints(){
        for (Point deckPoint : deckPoints) {
            if (isPointPresentInList(deckPoint, haloPoints)) {
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (ореол корабля)!");
                return false;
            }
        }
        return true;
    }
    private boolean isValidPoints(){
        for (Point deckPoint : deckPoints) {
            boolean checkX = deckPoint.getX() >= 0 && deckPoint.getX() <= 9;
            boolean checkY = deckPoint.getY() >= 0 && deckPoint.getY() <= 9;
            if (!(checkX && checkY)) {
                System.out.println("Координаты должны быть от 0 до 9!");
                return false;
            }
        }
        return true;
    }
    //The method checks if the Point that is being added to halo points is a deck of the ship
    private boolean isPointPresentInList(Point point, List<Point> listPoints){
        return listPoints.stream().anyMatch(c -> c.equals(point));
    }

    public List<Point> getDeckPoints() {
        return deckPoints;
    }

    public List<Point> getHaloPoints() {
        return haloPoints;
    }


    public boolean isDestroyed() {
        destroyed = deckPoints.stream().allMatch(Point::isWounded);
        return destroyed;
    }
}
