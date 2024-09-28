package core.basesyntax.model;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid implements Figure {
    private final String color;
    private final double height;
    private final double firstBase;
    private final double secondBase;

    public IsoscelesTrapezoid(String color, double height, double firstBase, double secondBase) {
        this.color = color;
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + color
                         + "Type: Isosceles Trapezoid"
                         + "Height: " + height
                         + "First Base: " + firstBase
                         + "Second Base: " + secondBase);
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }
}
