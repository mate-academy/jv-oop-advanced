package core.basesyntax.figures;

import core.basesyntax.base.Figure;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area() +
                " sq. units, first side: " + firstSide + " units," + " second side: " + secondSide + " units, color: " + color);
    }
}
