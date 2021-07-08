package core.basesyntax;

public class Square extends Figure {
    private double squareSide;
    private double squareArea;
    private String squareColor;
    private final static String FIGURE_NAME = "Square";

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    void chooseFigureColor(int randomColorNumber) {
        ColorSupplier colorSupplier = new ColorSupplier(randomColorNumber);
        squareColor = colorSupplier.getRandomColor();
    }

    @Override
    public double calculateArea() {
        squareArea = squareSide * squareSide;
        squareArea = (double) Math.round(squareArea * 100) / 100;
        return squareArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FIGURE_NAME +
                            ", area: " + squareArea +
                            " sq.units, squareSide: " + squareSide + " units" +
                            ", color: " + squareColor);
    }
}
