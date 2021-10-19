package com.engeto.ifloop;

public enum IntegerString {

    ONE("one"),
    TWO("two"),
    THREE("three");

    String printStr;

    IntegerString(String printStr) {
        this.printStr = printStr;
    }

    @Override
    public String toString() {
        return printStr;

    }
}
