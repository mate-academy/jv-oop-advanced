package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getDownSide() {
        return firstLeg;
    }

    public void setDownSide(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getLateralSides() {
        return secondLeg;
    }

    public void setLateralSides(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public String getInformation() {
        return "Figure: right triangle, area: " + new DecimalFormat("#.#").format(getArea())
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
