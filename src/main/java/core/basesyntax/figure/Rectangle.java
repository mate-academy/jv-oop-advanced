package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private final Color color;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                        + " sq. units, a: " + this.sideA
                        + " units, b: " + this.sideB
                        + " units, color: " + this.color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
