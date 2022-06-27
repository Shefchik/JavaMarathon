package day11.task1;

public class Picker extends Employee implements Worker{
    public final static int PICKER_SALARY_LIMIT = 80;
    public final static int PICKER_BONUS_AMOUNT = 70_000;
    private int packingSpeed;

    public  void doWork(){
        doWork(this, PICKER_SALARY_LIMIT);
    }

    public void bonus(){
        bonus(this, PICKER_BONUS_AMOUNT);
    }

    public Picker(String fIO, Warehouse warehouse, int packingSpeed) {
        super(fIO, PICKER_SALARY_LIMIT, warehouse);
        this.isPayed = false;
        this.packingSpeed = packingSpeed;
    }

    public int getPackingSpeed() {
        return packingSpeed;
    }

    public void setPackingSpeed(int packingSpeed) {
        this.packingSpeed = packingSpeed;
    }
}
