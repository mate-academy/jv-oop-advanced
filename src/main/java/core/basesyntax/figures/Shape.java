package core.basesyntax.figures;

import core.basesyntax.figures.interfaces.Drawable;
import core.basesyntax.figures.interfaces.ShapeCalculable;

public class Shape implements ShapeCalculable, Drawable {
    protected String color;
    protected double area;

    Shape(String color) {
        this.color = color;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return area;
    }

    @Override
    public void draw() {
        System.out.println("This is just a shape");
    }
}
