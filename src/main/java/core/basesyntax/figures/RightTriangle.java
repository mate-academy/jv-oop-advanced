package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;

import static core.basesyntax.ColorSupplier.getRandomColor;
import static core.basesyntax.RandomInt.getRandomInt;

public class RightTriangle extends Figure implements AreaCalculator {
    private int firstSide;
    private int secondSide;
    public String figureName = "right triangle";

    public RightTriangle() {
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
    public void getInfo() {
        System.out.println("Figure: " + figureName
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
