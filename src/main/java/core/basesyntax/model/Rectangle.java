package core.basesyntax.model;

import java.util.Random;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void setRandomParameters() {
        super.setRandomParameters();
        this.firstLeg = new Random().nextInt(100);
        this.secondLeg = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, firstLeg = " + firstLeg
                + " units, secondLeg = " + secondLeg + " units, colour: " + getColor();
    }
}
