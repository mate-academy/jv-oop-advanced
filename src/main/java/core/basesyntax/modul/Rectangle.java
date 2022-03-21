package core.basesyntax.modul;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void toDraw(double area) {
        System.out.println("Figure: rectangle"
                + ", area: " + area
                + ", first side: " + firstSide
                + ", second side: " + this.secondSide
                + ", color: " + getColor());
    }
}
