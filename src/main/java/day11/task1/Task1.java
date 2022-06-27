package day11.task1;


public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Worker worker1 = new Courier("Петров Петр Петрович - 1", warehouse1, true);
        Worker worker2 = new Picker("Шевцов Петр Петрович - 1",  warehouse1, 2);

        businessProcess(worker1);
        System.out.println("1 склад - 1-й работник - " + worker1);

        Warehouse warehouse2 = new Warehouse();
        Worker worker3 = new Courier("Васильев Петр Петрович - 1", warehouse2, true);
        Worker worker4 = new Picker("Логинов Петр Петрович - 1", warehouse2, 2);

        System.out.println("2 склад - 1-й работник - " + worker3);
        System.out.println("1 склад - 1-й работник - " + worker1);



    }
    static void businessProcess(Worker worker){
        final int CALLS_LIMIT = 10_000;
        for (int index = 0; index < CALLS_LIMIT; index++){
            worker.doWork();
        }
        worker.bonus();
    }

}
