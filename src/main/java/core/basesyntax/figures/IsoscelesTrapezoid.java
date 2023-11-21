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
        double area = calculateArea();
        double roundedArea = Math.round(area * 100.0) / 100.0;
        double roundedHeight = Math.round(height * 100.0) / 100.0;
        double roundedParallelSideFirst = Math.round(parallelSideFirst * 100.0) / 100.0;
        double roundedParallelSideSecond = Math.round(parallelSideSecond * 100.0) / 100.0;

        System.out.println("Figure: " + TYPE + ", area: " + roundedArea + " sq. units, height: "
                + roundedHeight + " units, parallelSideFirst: " + roundedParallelSideFirst
                + " units, parallelSideSecond: " + roundedParallelSideSecond + " units color: "
                + getColor());
    }
}
