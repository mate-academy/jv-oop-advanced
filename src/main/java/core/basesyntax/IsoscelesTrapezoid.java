package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private int hight;

    public IsoscelesTrapezoid(String color, int upperSide, int lowerSide, int hight) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.hight = hight;
    }

    public double findArea() {
        return ((upperSide + lowerSide) / 2) * hight;
    }

    public String draw() {
        return "Figure: isosceles trapezoid, " + "area: "
                + String.format("%.1f",findArea()) + " sq.units, firstLeg: " + upperSide
                + " units, lowerSide: " + upperSide + " units, hight: " + hight
                + " units, color: " + getColor();
    }
}

