package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double edge;
    private String isoscelesTrapezoidColor;

    public IsoscelesTrapezoid(double baseA, double baseB, double edge,
                              String isoscelesTrapezoidColor) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.edge = edge;
        this.isoscelesTrapezoidColor = isoscelesTrapezoidColor;
    }

    @Override
    public double calculateArea() {
        double expresionUnderSqrt = Math.pow(edge, 2) - Math.pow((baseB - baseA), 2) / 4;

        if (expresionUnderSqrt < 0) {
            double isoscelesTrapezoidArea = -1;
            System.out.println("There is minus value under the root! "
                    + "isoscelesTrapezoidArea idicate as -1");
            return isoscelesTrapezoidArea;
        } else {
            double isoscelesTrapezoidArea = (baseA + baseB) * Math.sqrt(expresionUnderSqrt) / 2;
            isoscelesTrapezoidArea = (double) Math.round(isoscelesTrapezoidArea * 100) / 100;
            return isoscelesTrapezoidArea;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + IsoscelesTrapezoid.class.getSimpleName()
                + ", area: " + calculateArea()
                + " sq.units, baseA: " + baseA
                + " units, baseB: " + baseB
                + " units, edge: " + edge + " units"
                + ", color: " + isoscelesTrapezoidColor);
    }
}
