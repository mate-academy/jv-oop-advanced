package core.basesyntax.entity;

import core.basesyntax.Figure;
import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        this.firstLeg = new Random().nextInt(MAX_VALUE);
        this.secondLeg = new Random().nextInt(MAX_VALUE);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + super.color;
    }
}
