package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBaseLengths;
    private double secondBaseLengths;

    public IsoscelesTrapezoid(Color color, double height,
                              double firstBaseLengths, double secondBaseLengths) {
        super(color);
        this.height = height;
        this.firstBaseLengths = firstBaseLengths;
        this.secondBaseLengths = secondBaseLengths;
    }

    @Override
    public double getArea() {
        return height / 2 * (firstBaseLengths + secondBaseLengths);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.unit, height: " + height
                + " units, first base lengths: " + firstBaseLengths
                + " units, second base lengths: " + secondBaseLengths
                + " units, color: " + getColor().name());
    }
}
