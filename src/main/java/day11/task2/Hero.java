package day11.task2;

public abstract class Hero {
    final static int HEALTH_MAX_VALUE = 100;
    final static int HEALTH_MIN_VALUE = 0;

    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;
    protected int magicAtt;

    public Hero(){
        health = 100;
    }

    protected int getCorrectHealth(int currentHealth, int healDamagePoints){
        int result = currentHealth;
        result += healDamagePoints;
        return  result > HEALTH_MAX_VALUE ? HEALTH_MAX_VALUE :
                    result < HEALTH_MIN_VALUE ? HEALTH_MIN_VALUE : result;
    }

    protected int getAbsoluteDamage(int attackPoints, double defencePointsPercent){
        return  attackPoints - (int) Math.round(attackPoints * defencePointsPercent);
    }
}
