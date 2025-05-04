package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class Rectangle extends FigureImpl {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, firstSide: " + firstLeg + " units,"
                + " secondSide: " + secondLeg + " units,"
                + " color: " + getColor()
        );
    }
}
