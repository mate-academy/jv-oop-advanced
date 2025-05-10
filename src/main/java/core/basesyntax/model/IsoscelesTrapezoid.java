package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int higher;
    private int oneSide;
    private int secondSide;

    public IsoscelesTrapezoid(Color color, int higher, int oneSide, int secondSide) {
        super(color);
        this.higher = higher;
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
    public void draw() {
        System.out.println("Figure: " + "isosceles trapezoid" + ", area: "
                + getArea() + " sq.units, top side: "
                + getOneSide() + " units, bottom side: "
                + getSecondSide() + " units, higher: " + getHigher()
                + " units, color: " + getColor().name().toLowerCase());
    }
}
