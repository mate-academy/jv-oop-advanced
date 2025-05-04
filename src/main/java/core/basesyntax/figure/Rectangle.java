package core.basesyntax.figure;

import core.basesyntax.enums.Color;

public class Rectangle extends AbstractFigure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, firstSide: " + firstSide + " units,"
                + " secondSide: " + secondSide + " units,"
                + " color: " + getColor()
        );
    }

}
