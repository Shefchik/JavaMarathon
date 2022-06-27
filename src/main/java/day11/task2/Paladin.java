package day11.task2;

public class Paladin  extends Hero implements Healer, PhysAttack{

    public void healHimself(){
        health = getCorrectHealth(health, 25);
    }
    public void healTeammate(Hero hero){
        hero.health = getCorrectHealth(hero.health, 10);
    }

    public void physicalAttack(Hero hero){
        hero.health = getCorrectHealth(hero.health, -getAbsoluteDamage(physAtt, hero.physDef));
    }
    public Paladin(){
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    public String toString(){
        return "Paladin {health + " + health + "}";
    }

}
