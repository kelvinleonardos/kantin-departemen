package com.example.kantindepartemen;

public class Table {

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    private int tableNumber;
    private boolean isBooked;

    public Table(int tableNumber, boolean isBooked) {
        this.tableNumber = tableNumber;
        this.isBooked = isBooked;
    }

}