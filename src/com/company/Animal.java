package com.company;
public class Animal implements Printtable{
    private int lap;

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public Animal(int lap) {

        this.lap = lap;
    }

    @Override
    public void print() {
        System.out.println("lap"+getLap());

    }
}
