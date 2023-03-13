package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (double)firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + EnumFigure.RECTANGLE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " firstSide: " + firstSide + " units,"
                + " secondSide: " + secondSide + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
