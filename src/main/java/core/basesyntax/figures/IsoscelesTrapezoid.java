package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private static final String TYPE = "isosceles trapezoid";
    private double height;
    private double parallelSideFirst;
    private double parallelSideSecond;

    public IsoscelesTrapezoid(double height, double parallelSideFirst,
            double parallelSideSecond, String color) {
        super(color);
        this.height = height;
        this.parallelSideFirst = parallelSideFirst;
        this.parallelSideSecond = parallelSideSecond;
    }

    @Override
  public double calculateArea() {
        return (parallelSideFirst + parallelSideSecond) / 2 * height;
    }

    @Override
  public void draw() {
        System.out.println("Figure: " + TYPE + ", area: " + getRoundedValue(calculateArea())
                + " sq. units, height: " + getRoundedValue(height) + " units, parallelSideFirst: "
                + getRoundedValue(parallelSideFirst) + " units, parallelSideSecond: "
                + getRoundedValue(parallelSideSecond) + " units color: " + getColor());
    }
}
