package day11.task1;

public class Employee {
    protected String fIO;
    protected int salary;

    protected int bonusAmount;
    protected boolean isPayed;
    protected boolean isBonusPayed;
    protected Warehouse warehouse;


    public void doWork(Worker worker, int salary) {
        setSalary(salary);
        setPayed(true);

        if (worker instanceof Courier) {
            this.warehouse.increaseCountDeliveredOrders();
        }else {
            this.warehouse.increaseCountPickedOrders();
        }
    }
    public void bonus(Worker worker, int bonusAmount){

        boolean isBonusDelivered = this.warehouse.getCountDeliveredOrders() >= Warehouse.BONUS_ORDERS_COUNT;
        boolean isBonusPicked = this.warehouse.getCountPickedOrders() >= Warehouse.BONUS_ORDERS_COUNT;

        if (!isBonusPicked && !isBonusDelivered){
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(!isBonusPayed){
            setBonus(bonusAmount);
            setBonusPayed(true);
        }else {
            System.out.println("Бонус уже был выплачен!");
        }
    }


    public void setBonusPayed(boolean bonusPayed) {
        isBonusPayed = bonusPayed;
    }

    public boolean isBonusPayed() {
        return isBonusPayed;
    }

    public void setBonus(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setFIO(String fIO) {
        this.fIO = fIO;
    }

    public String getfIO() {
        return fIO;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Employee(String fIO, int salary, Warehouse warehouse) {
        this.fIO = fIO;
        this.salary = salary;
        this.isPayed = false;
        this.warehouse = warehouse;
    }
    public String getBonusInfo(){
        return "Is bonus payed: " + (isBonusPayed ? "Yes" : "No") + ", Bonus amount: "  + bonusAmount;
    }


    @Override
    public String toString() {
        return "FIO = " + fIO + ", Salary = " + salary + ", is it Payed? = " + (isPayed ? "Yes" : "No")
                    + ", " + getBonusInfo();

    }

}
