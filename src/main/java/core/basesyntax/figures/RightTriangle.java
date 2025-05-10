package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private static final String TYPE = "right triangle";
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
  public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
  public void draw() {
        System.out.println("Figure: " + TYPE + ", area: " + getRoundedValue(calculateArea())
                + " sq. units, firstLeg: " + getRoundedValue(firstLeg) + " units, secondLeg: "
                + getRoundedValue(secondLeg) + " units, color: " + getColor());
    }
}
