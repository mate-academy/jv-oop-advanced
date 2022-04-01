package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final Random random = new Random();
    private int firstBase;
    private int secondBase;
    private double height;

    public IsoscelesTrapezoid(String name, String color, int firstBase, int secondBase, double height) {
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
    public void getDraw() {
        System.out.println("Figure: Isosceles Trapezoid, Color: " + getColor() + ", First Base: " + firstBase + ", Second Base: " + secondBase + ", Heihgt: " + height + ", Area: " + getArea() + ".");
    }

}
