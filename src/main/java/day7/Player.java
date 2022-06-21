package day7;

public class Player {

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static final int REQUIRED_PLAYERS_NUMBER = 6;
    private int stamina;
    private static int countPlayers;

    public void run(){
        if (stamina > MIN_STAMINA && stamina <= MAX_STAMINA){
            stamina--;
        }
        if(stamina == MIN_STAMINA){
            countPlayers--;
        }

    }

    public void info(){
        String result;
        if (countPlayers < REQUIRED_PLAYERS_NUMBER){
            int freePlaceCount = REQUIRED_PLAYERS_NUMBER - countPlayers;
            String freePlaceString = switch (freePlaceCount) {
                case 5, 6 -> " свободных мест";
                case 4, 3, 2 -> " свободных места";
                case 1 -> " свободное место";
                default -> "";
            };
            result = "Команды неполные. На поле еще есть " + freePlaceCount + freePlaceString;
        }else {
            result = "На поле нет свободных мест";
        }
        System.out.println(result);
    }

    public Player(int stamina){
        if (stamina >= MIN_STAMINA && stamina <= MAX_STAMINA){
            this.stamina = stamina;

            if(countPlayers < REQUIRED_PLAYERS_NUMBER){
                countPlayers++;
            }
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
