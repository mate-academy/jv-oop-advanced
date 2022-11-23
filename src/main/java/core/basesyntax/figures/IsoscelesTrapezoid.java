package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstSide;
    private int secondSide;

    @Override
    public void draw() {
        setFigureName("isosceles trapezoid");
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, height: " + getHeight()
                + " units, first side " + getFirstSide()
                + " units, second side" + getSecondSide()
                + " units, color: " + getColor());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

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
    public double getArea() {
        return ((firstSide + secondSide) / 2) * height;
    }
}
