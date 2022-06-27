package day11.task1;

public class Courier extends Employee implements  Worker{
    public final static int COURIER_SALARY_LIMIT = 100;
    public final static int COURIER_BONUS_AMOUNT = 50_000;

    boolean cityKnowledge;

    public  void doWork(){
        doWork(this, COURIER_SALARY_LIMIT);
    }

    public void bonus(){
        bonus(this, COURIER_BONUS_AMOUNT);
    }


    public Courier(String fIO, Warehouse warehouse, boolean cityKnowledge) {
        super(fIO, COURIER_SALARY_LIMIT, warehouse);
        this.cityKnowledge = cityKnowledge;
    }

    public void setCityKnowledge(boolean cityKnowledge) {
        this.cityKnowledge = cityKnowledge;
    }

    public boolean isCityKnowledge() {
        return cityKnowledge;
    }

}
