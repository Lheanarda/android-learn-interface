package com.example.interfaceinjava;

public class Boxer implements Fighting{
    private int power;

    public Boxer(int power) {
        this.power = power;
    }

    @Override
    public String throwJab() {
        return "Throw Faster Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Faster Cross";
    }

    @Override
    public String throwHook() {
        return "Throw Faster Hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw Faster Uppercut";
    }
}
