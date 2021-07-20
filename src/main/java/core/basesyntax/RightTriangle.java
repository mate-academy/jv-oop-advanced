package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(String color, int legA, int legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    public int getLegA() {
        return legA;
    }

    public void setLegA(int legA) {
        this.legA = legA;
    }

    public int getLegB() {
        return legB;
    }

    public void setLegB(int legB) {
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return (double) (legA * legB / 2);
    }

    @Override
    public String getInformation() {
        return "Figure: right triangle, area: " + new DecimalFormat("#.##").format(getArea())
                + " sq.units, legA: " + legA + " units, legB " + legB
                + " units, color: " + getColor();
    }
}
