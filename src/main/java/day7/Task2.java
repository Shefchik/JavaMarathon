package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random r = new Random();
        int max = Player.MAX_STAMINA;
        int min = 90;
        List<Player> players = new ArrayList<>();
        players.add(new Player(r.nextInt(max - min) + min));
        players.add(new Player(r.nextInt(max - min) + min));
        players.add(new Player(r.nextInt(max - min) + min));
        players.add(new Player(r.nextInt(max - min) + min));
        players.add(new Player(r.nextInt(max - min) + min));
        players.add(new Player(r.nextInt(max - min) + min));


        for(Player item : players){
            int numberOfRuns = r.nextInt(item.getStamina());
            item.info();
            for(int index = 0; index <  numberOfRuns; index++){
                item.run();
            }
        }

        if(players.get(0).getStamina() != Player.MIN_STAMINA){
            System.out.println("Current number of players on the field:" + Player.getCountPlayers());
            System.out.println("The player " + players.get(0).hashCode() + " has stamina equal to " +
                                players.get(0).getStamina() + " will run " + players.get(0).getStamina()  + " times");

            int currentStamina = players.get(0).getStamina();
            for (int index = 0; index < currentStamina; index++){
                players.get(0).run();
            }
        }
        System.out.println("Current number of players on the field:" + Player.getCountPlayers());
        players.get(0).info();
    }
}
