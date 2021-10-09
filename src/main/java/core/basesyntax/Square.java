package core.basesyntax;

public class Square extends Figure {
    private double squareSide;
    private String squareColor;

    public Square(double squareSide, String squareColor) {
        this.squareSide = squareSide;
        this.squareColor = squareColor;
    }

    @Override
    public double calculateArea() {
        double squareArea = squareSide * squareSide;
        squareArea = (double) Math.round(squareArea * 100) / 100;
        return squareArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + Square.class.getSimpleName()
                            + ", area: " + calculateArea()
                            + " sq.units, squareSide: " + squareSide + " units"
                            + ", color: " + squareColor);
    }
}
