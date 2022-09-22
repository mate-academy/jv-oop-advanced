package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.firstLeg = new Random().nextInt(100);
        this.secondLeg = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor();

    }
}
