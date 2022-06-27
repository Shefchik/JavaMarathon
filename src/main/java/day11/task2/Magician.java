package day11.task2;

public class Magician  extends Hero implements PhysAttack, MagicAttack{


    public void physicalAttack(Hero hero){
        hero.health = getCorrectHealth(hero.health, -getAbsoluteDamage(physAtt, hero.physDef));
    }
    public void magicalAttack(Hero hero){
        hero.health = getCorrectHealth(hero.health, -getAbsoluteDamage(magicAtt, hero.magicDef));
    }
    public Magician(){
        physAtt = 5;
        magicAtt = 20;
        physDef = 0.0;
        magicDef = 0.8;
    }
    public String toString(){
        return "Magician {health + " + health + "}";
    }
}
