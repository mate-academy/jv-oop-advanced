package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final double height;

    public IsoscelesTrapezoid(String name, String color,
                              int firstBase, int secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, Color: " + getColor()
                + ", First Base: " + firstBase
                + ", Second Base: " + secondBase
                + ", Heihgt: " + height
                + ", Area: " + getArea() + ".");
    }
}
