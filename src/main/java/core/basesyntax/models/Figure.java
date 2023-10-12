package core.basesyntax.models;

import core.basesyntax.interfaces.AreaDerived;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaDerived {
    private String color;
    private double area;

    public Figure() {
    }

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName() + ", area: " + area + " sq.units";
    }

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
}
