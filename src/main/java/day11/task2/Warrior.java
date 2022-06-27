package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public void physicalAttack(Hero hero){
        hero.health = getCorrectHealth(hero.health, -getAbsoluteDamage(physAtt, hero.physDef));
    }

    public Warrior(){
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0.0;
    }

    public String toString(){
        return "Warrior {health + " + health + "}";
    }

}
