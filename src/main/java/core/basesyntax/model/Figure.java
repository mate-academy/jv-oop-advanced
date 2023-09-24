package core.basesyntax.model;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.Drawable;
import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFigureCount() {
        return figureCount;
    }

    public Random getRandom() {
        return random;
    }
}
