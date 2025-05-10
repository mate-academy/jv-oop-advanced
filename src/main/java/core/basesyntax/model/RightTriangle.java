package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

public class RightTriangle extends Figure {
    private int oneSide;
    private int secondSide;

    public RightTriangle(Color color, int oneSide, int secondSide) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    public int getOneSide() {
        return oneSide;
    }

    public void setOneSide(int oneSide) {
        this.oneSide = oneSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return ((double) getOneSide() * getSecondSide() / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "right rectangle" + ", area: "
                + getArea() + " sq.units, firstLeg: "
                + getOneSide() + " units, secondLeg: "
                + getSecondSide() + " units, color: "
                + getColor().name().toLowerCase());
    }
}
