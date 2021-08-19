package main.java.core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, first Leg: "
                + firstLeg + " units, " + "second Leg: " + secondLeg
                + " units, color: " + getColor();
    }
}
