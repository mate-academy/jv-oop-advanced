package core.basesyntax;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Draw;

public abstract class Figure implements Draw, AreaCalculator {
    private String color;
    private double area;

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {

        return color;
    }

}
