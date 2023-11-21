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
        double area = calculateArea();
        double roundedArea = Math.round(area * 100.0) / 100.0;
        double roundedFirstLeg = Math.round(firstLeg * 100.0) / 100.0;
        double roundedSecondLeg = Math.round(secondLeg * 100.0) / 100.0;

        System.out.println("Figure: " + TYPE + ", area: " + roundedArea + " sq. units, firstLeg: "
                + roundedFirstLeg + " units, secondLeg: " + roundedSecondLeg + " units, color: "
                + getColor());
    }
}
