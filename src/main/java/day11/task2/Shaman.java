package day11.task2;

public class Shaman  extends Hero implements  Healer, PhysAttack, MagicAttack{

    public void healHimself(){
        health = getCorrectHealth(health, 50);
    }

    public void healTeammate(Hero hero){
        hero.health = getCorrectHealth(hero.health, 30);
    }

    public void physicalAttack(Hero hero){
        hero.health = getCorrectHealth(hero.health, -getAbsoluteDamage(physAtt, hero.physDef));
    }
    public void magicalAttack(Hero hero){
        hero.health = getCorrectHealth(hero.health, -getAbsoluteDamage(magicAtt, hero.magicDef));
    }

    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    public String toString(){
        return "Shaman {health + " + health + "}";
    }


}
