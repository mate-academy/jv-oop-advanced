package core.basesyntax.model;

import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void setRandomParameters() {
        super.setRandomParameters();
        this.firstLeg = new Random().nextInt(100);
        this.secondLeg = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, firstLeg = " + firstLeg
                + " units, secondLeg = " + secondLeg + " units, colour: " + getColor();
    }
}
