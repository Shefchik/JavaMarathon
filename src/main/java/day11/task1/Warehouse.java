package day11.task1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public final static int BONUS_ORDERS_COUNT = 10_000;
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse() {
        this.countPickedOrders = 0;
        this.countDeliveredOrders = 0;
    }

    public void increaseCountPickedOrders(){
        countPickedOrders++;
    }

    public void increaseCountDeliveredOrders(){
        countDeliveredOrders++;
    }


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Number of Picked orders = " + countPickedOrders + ", Number of Delivered orders = " + countDeliveredOrders;
    }


}
