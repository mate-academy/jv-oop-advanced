package core.basesyntax;

public class Square extends Figure {
    private double side;

    {
        figureType = FigureType.SQUARE;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
        calculateSquareArea();
    }

    private void calculateSquareArea() {
        area = calculateQuadrangularArea(side, side);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType.name()
                + ", area:  " + decimalFormat.format(area) + " sq. units, side: "
                + decimalFormat.format(side) + " units, color: " + color);
    }
}
