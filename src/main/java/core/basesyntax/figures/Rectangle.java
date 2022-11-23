package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        setFigureName("rectangle");
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, first side " + getFirstSide()
                + " units, second side " + getSecondSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
