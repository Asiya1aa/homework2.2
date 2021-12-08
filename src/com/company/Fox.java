package com.company;

public class Fox extends Animal {
    private String nose;

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public Fox(int lap, String nose) {
        super(lap);
        this.nose = nose;
    }
    public void print() {
        System.out.println("lap"+getLap()+"nose"+getNose());

    }
}
