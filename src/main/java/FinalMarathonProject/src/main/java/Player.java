package FinalMarathonProject.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class Player {
    private final String name;
    private List<Ship> shipList;

    String freePointColor = "\u2B1C";
    String shipDeckColor = "\u1F6A2";
    String  shipWoundedDeckColor = "\uD83D\uDFE5";
    String haloPointColor = "\uD83D\uDFE6";

    private boolean theGameIsLost;
    public Player(String name){
        this.name = name;
        shipList = new ArrayList<>();
        theGameIsLost = false;
    }

    public void setUpShips(){
        System.out.println("Начнем расставлять корабли на поле " + name + ". Другой игрок, не смотри!");
        List<Point> totalHaloPoints = new ArrayList<>();
        shipList.add(new Ship(4));
        shipList.add(new Ship(3));
        shipList.add(new Ship(3));
        shipList.add(new Ship(2));
        shipList.add(new Ship(2));
        shipList.add(new Ship(2));
        shipList.add(new Ship(1));
        shipList.add(new Ship(1));
        shipList.add(new Ship(1));
        shipList.add(new Ship(1));
        shipList.forEach(s -> {
            s.setUpShip(totalHaloPoints);
            showShipsSetUp();
        });


    }
    public void showShipsSetUp(){
        for(int indexY = Ship.MIN_COORDINATE; indexY <= Ship.MAX_COORDINATE; indexY++){
            for(int indexX = Ship.MIN_COORDINATE; indexX <= Ship.MAX_COORDINATE; indexX++){

                int finalIndexX = indexX;
                int finalIndexY = indexY;
                AtomicBoolean isDeckPoint = new AtomicBoolean(false);
                AtomicBoolean isWounded = new AtomicBoolean(false);
                AtomicBoolean isHaloPoint = new AtomicBoolean(false);
                shipList.forEach(ship -> {

                        isHaloPoint.set(ship.getHaloPoints()
                                .stream()
                                .anyMatch(p -> p.equals(new Point(finalIndexX, finalIndexY))));

                        if(!isDeckPoint.get()) {
                            isDeckPoint.set(ship.getDeckPoints()
                                    .stream()
                                    .anyMatch(p -> p.equals(new Point(finalIndexX, finalIndexY))));
                        }

                        if(!isWounded.get()) {
                            isWounded.set(ship.getDeckPoints()
                                    .stream()
                                    .anyMatch(p -> p.equals(new Point(finalIndexX, finalIndexY)) && p.isWounded()));
                        }
                });

                if(isDeckPoint.get()){
                    printFieldPoint(finalIndexX, (isWounded.get()) ? shipWoundedDeckColor : shipDeckColor);
                } else if (isHaloPoint.get()) {
                    printFieldPoint(finalIndexX, haloPointColor);
                }else {
                    printFieldPoint(finalIndexX, freePointColor);
                }
            }
        }
    }

    public boolean shoot(Player attackedPlayer, Point shootPoint){
        if(attackedPlayer.isTheTargetHit(shootPoint)){
            return true;
        }else{
            System.out.println("Мимо!");
            return false;
        }

    }

    public boolean isTheTargetHit(Point shootPoint){
        AtomicBoolean isHit = new AtomicBoolean(false);
        shipList.forEach(ship -> {
            Optional<Point> matchPoint = ship.getDeckPoints().stream()
                    .filter(point -> point.equals(shootPoint)).findFirst();

            if (matchPoint.isPresent()) {
                matchPoint.get().setWounded(true);
                if (ship.isDestroyed()) {
                    System.out.println("Утопил!");
                } else {
                    System.out.println("Попадание!");
                }
                setTheGameLost();
                isHit.set(true);
            }
        });
        return isHit.get();
    }

    public boolean isTheGameIsLost() {
        return theGameIsLost;
    }

    public void setTheGameLost(){
        theGameIsLost = shipList.stream().allMatch(Ship::isDestroyed);
    }
    public String getName() {
        return name;
    }

    private void printFieldPoint(int index, String color){
        System.out.print((index < Ship.MAX_COORDINATE) ? color : color + "\n");
    }

}
