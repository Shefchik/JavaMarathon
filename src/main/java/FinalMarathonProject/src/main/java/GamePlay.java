package FinalMarathonProject.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePlay {
    final static int MIN_PLAYER_INDEX = 0;
    final static int MAX_PLAYER_INDEX = 1;

    public void startTheGame(String playerOneName, String playerTwoName){

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(playerOneName));
        playerList.add(new Player(playerTwoName));
        playerList.forEach(Player::setUpShips);

        int shootingPlayerIndex = randomWithRange(MIN_PLAYER_INDEX, MAX_PLAYER_INDEX);
        int attackedPlayerIndex = getPlayerIndex(shootingPlayerIndex);

        boolean proceedTheGame = true;

        while(proceedTheGame){

            //--Get the hit target coordinates!
            Scanner scanner = new Scanner(System.in);
            System.out.println("Игрок " + playerList.get(shootingPlayerIndex).getName() + ", введите координаты для выстрела: ");
            String input = scanner.next();
            String[] xy = input.split(",");
            Point shootPoint = new Point(Integer.parseInt(xy[0]),Integer.parseInt(xy[1]));

            //If the target is not hit then switch the shooting player vice versa
            if(!playerList.get(shootingPlayerIndex).shoot(playerList.get(attackedPlayerIndex), shootPoint)){
                shootingPlayerIndex = getPlayerIndex(shootingPlayerIndex);
                attackedPlayerIndex = getPlayerIndex(attackedPlayerIndex);
            }else{
            //otherwise check if all the set wounded, check if the ship sank, check if the game is lost and the other player won
                proceedTheGame = playerList.stream().noneMatch(Player::isTheGameIsLost);
                if(!proceedTheGame){
                    System.out.println("Игрок " + playerList.stream()
                            .filter(plr -> !plr.isTheGameIsLost())
                            .findFirst()
                            .get()
                            .getName()
                            + " победил!");
                }
            }
        }
    }

    public static int getPlayerIndex(int currentIndex){
        return (currentIndex == MIN_PLAYER_INDEX) ? MAX_PLAYER_INDEX : MIN_PLAYER_INDEX;
    }
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}
