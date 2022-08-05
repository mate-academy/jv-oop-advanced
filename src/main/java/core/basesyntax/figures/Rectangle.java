package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area: " + getArea() + ", first side: " + firstSide
                + ", second side: " + secondSide + ", color: " + getColor());
    }
}
