package com.company;

public class Lion extends Animal{
    private int ears;

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public Lion(int lap, int ears) {
        super(lap);
        this.ears = ears;
    }
    public void print() {
        System.out.println("lap"+getLap()+"lap"+getLap());

    }
}
