package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    {
        figureType = FigureType.RIGHT_TRIANGLE;
    }

    public RightTriangle() {
    }

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        calculateRightTriangleArea();
    }

    private void calculateRightTriangleArea() {
        area = calculateTriangleArea(firstLeg, secondLeg);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType
                + ", area: " + decimalFormat.format(area) + " sq. units, first leg: "
                + decimalFormat.format(firstLeg) + " units, second leg: "
                + decimalFormat.format(secondLeg) + " units, color: " + color);
    }
}
