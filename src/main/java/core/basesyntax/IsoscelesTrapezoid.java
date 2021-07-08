package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double edge;
    private double isoscelesTrapezoidArea;
    private String isoscelesTrapezoidColor;
    private final static String FIGURE_NAME = "IsoscelesTrapezoid";

    public IsoscelesTrapezoid(double baseA, double baseB, double edge) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.edge = edge;
    }

    @Override
    void chooseFigureColor(int randomColorNumber) {
        ColorSupplier colorSupplier = new ColorSupplier(randomColorNumber);
        isoscelesTrapezoidColor = colorSupplier.getRandomColor();
    }

    @Override
    public double calculateArea() {
        double expresionUnderSqrt = Math.pow(edge, 2) - Math.pow((baseB - baseA), 2) / 4;

        if (expresionUnderSqrt < 0) {
            isoscelesTrapezoidArea = -1;
            System.out.println("There is minus value under the root! isoscelesTrapezoidArea idicate as -1");
            return isoscelesTrapezoidArea;
        } else {
            isoscelesTrapezoidArea = (baseA + baseB) * Math.sqrt(expresionUnderSqrt) / 2;
            isoscelesTrapezoidArea = (double) Math.round(isoscelesTrapezoidArea * 100) / 100;
            return isoscelesTrapezoidArea;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FIGURE_NAME +
                ", area: " + isoscelesTrapezoidArea +
                " sq.units, baseA: " + baseA +
                " units, baseB: " + baseB
                + " units, edge: " + edge + " units" +
                ", color: " + isoscelesTrapezoidColor);
    }
}
