package core.basesyntax;

public class Rectangle extends Figure {
    private double leftSide;
    private double downSide;

    {
        figureType = FigureType.RECTANGLE;
    }

    public Rectangle() {
    }

    public Rectangle(double leftSide, double downSide) {
        this.leftSide = leftSide;
        this.downSide = downSide;
        calculateRectangleArea();
    }

    private void calculateRectangleArea() {
        area = calculateQuadrangularArea(leftSide, downSide);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType
                + ", area: " + decimalFormat.format(area) + " sq. units, left side: "
                + decimalFormat.format(leftSide) + " units, down side: "
                + decimalFormat.format(downSide) + " units, color: " + color);
    }
}
