package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.initializeWorkers();
        warehouse.addWorker(new Courier("Петров Петр Петрович - 1", new Warehouse(), true));
        warehouse.addWorker(new Courier("Васильев Петр Петрович - 1", new Warehouse(), true));
        warehouse.addWorker(new Courier("Логинов Петр Петрович - 1", new Warehouse(), true));
        warehouse.addWorker(new Courier("Шевцов Петр Петрович - 1", new Warehouse(), true));


    }
}
