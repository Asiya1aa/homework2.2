package com.company;

public class Wolf extends Animal{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wolf(int lap, String name) {
        super(lap);
        this.name = name;
    }
    public void print() {
        System.out.println("lap"+getLap()+"name"+getName());

    }
}
