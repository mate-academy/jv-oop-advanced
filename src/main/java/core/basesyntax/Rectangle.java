package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private double rectangleArea;
    private String rectangleColor;
    private final static String FIGURE_NAME = "Rectangle";

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void chooseFigureColor(int randomColorNumber) {
        ColorSupplier colorSupplier = new ColorSupplier(randomColorNumber);
        rectangleColor = colorSupplier.getRandomColor();
    }

    @Override
    public double calculateArea() {
        rectangleArea = sideA * sideB;
        rectangleArea = (double) Math.round(rectangleArea * 100) / 100;
        return rectangleArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FIGURE_NAME +
                ", area: " + rectangleArea +
                " sq.units, sideA: " + sideA +
                " units, sideB: " + sideB + " units" +
                ", color: " + rectangleColor);
    }
}
