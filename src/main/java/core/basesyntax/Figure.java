package core.basesyntax;

import java.awt.*;

public abstract class Figure implements Calculations, Drawing {
    private Colors color;
    private double area;

    public Colors getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public abstract void calculateArea();
}
