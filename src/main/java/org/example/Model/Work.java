package org.example.Model;

public class Work {
    protected int id;
    static int ID = 0;
    protected String phoneNumber;
    protected String name;
    protected int stage;

    public Work(String phoneNumber, String name, int stage) {
        this.id = ++ID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.stage = stage;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", номер телефона = " + phoneNumber + ", имя = " + name + ", стаж = " + stage;
    }
}