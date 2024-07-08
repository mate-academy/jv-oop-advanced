package model;

import utility.AreaCalculator;
import utility.PrintInfo;

public abstract class Figure implements AreaCalculator, PrintInfo {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
