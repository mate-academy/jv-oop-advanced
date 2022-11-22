package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;

import static core.basesyntax.ColorSupplier.getRandomColor;
import static core.basesyntax.RandomInt.getRandomInt;

public class IsoscelesTrapezoid extends Figure {

    private int height;
    private int firstSide;
    private int secondSide;
    public String figureName = "isosceles trapezoid";

    public IsoscelesTrapezoid() {
    }

    @Override
    public void getInfo() {
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

    @Override
    public void setRandomProperties() {
        setHeight(getRandomInt(20));
        setFirstSide(getRandomInt(20));
        setSecondSide(getRandomInt(20));
    }
}
