package core.basesyntax;

import java.awt.*;

public abstract class Figure {
    private FigureType type;
    private String color;
    public Figure() {
        //this.type = type;
        this.color = ColorSupplier.getRandomColor();
    }
    private enum FigureType {
        square,
        rectangle,
        right_triangle,
        circle,
        isosceles_trapezoid
    }
    public String getGigureType() {
        return "" + type;
    }
    public abstract double getArea();
    public abstract void draw();
}
