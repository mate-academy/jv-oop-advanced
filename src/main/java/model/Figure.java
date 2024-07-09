package model;

import utility.AreaCalculator;
import utility.Printable;

public abstract class Figure implements AreaCalculator, Printable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
