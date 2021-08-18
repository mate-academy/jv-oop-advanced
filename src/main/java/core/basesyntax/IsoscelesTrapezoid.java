package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int downSide;
    private int upperSide;
    private int lateralSides;

    public IsoscelesTrapezoid(String color, int downSide, int upperSide, int lateralSides) {
        super(color);
        this.downSide = downSide;
        this.upperSide = upperSide;
        this.lateralSides = lateralSides;
    }

    public int getDownSide() {
        return downSide;
    }

    public void setDownSide(int downSide) {
        this.downSide = downSide;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getLateralSides() {
        return lateralSides;
    }

    public void setLateralSides(int lateralSides) {
        this.lateralSides = lateralSides;
    }

    @Override
    public double getArea() {
        return (downSide + upperSide) / 2 * Math.sqrt(lateralSides * lateralSides
                - ((downSide + upperSide) * (downSide + upperSide) / 4));
    }

    @Override
    public String getInformation() {
        return "Figure: isosceles trapezoid, area: "
                + new DecimalFormat("#.#").format(getArea())
                + " sq.units, downSide: " + downSide + " units, upperSide "
                + upperSide + " units, lateralSides " + lateralSides
                + " units, color: " + getColor();
    }
}
