package core.basesyntax.figures;

import static core.basesyntax.RandomInt.getRandomInt;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;
    private String figureName = "right triangle";

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
    public void getInfo() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, first side " + getFirstSide()
                + " units, second side " + getSecondSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void setRandomProperties() {
        setFirstSide(getRandomInt(20));
        setSecondSide(getRandomInt(20));
    }
}
