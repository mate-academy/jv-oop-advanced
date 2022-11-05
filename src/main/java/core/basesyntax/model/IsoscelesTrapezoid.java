package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;

public class IsoscelesTrapezoid extends Rectangle {
    private int higher;
    private String figureType = "isosceles trapezoid";

    public IsoscelesTrapezoid(Color color, int oneSide, int secondSide, int higher) {
        super(color, oneSide, secondSide);
        this.higher = higher;
    }

    public int getHigher() {
        return higher;
    }

    public void setHigher(int higher) {
        this.higher = higher;
    }

    @Override
    public double getArea() {
        return 1 / 2 * ((double) getOneSide() + (double) getSecondSide()) * (double) getHigher();
    }

    @Override
    public String toString() {
        return "Figure: " + figureType + ", area: " + getArea() + " sq.units, top side: "
                + getOneSide() + " units, bottom side: "
                + getSecondSide() + " units, higher: " + getHigher()
                + " units, color: " + getColor().toString().toLowerCase();
    }
}
