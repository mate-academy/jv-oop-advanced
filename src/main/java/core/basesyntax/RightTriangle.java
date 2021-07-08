package core.basesyntax;

public class RightTriangle extends Figure {
    private double katetA;
    private double katetB;
    private double rightTriangleArea;
    private String rightTriangleColor;
    private final static String FIGURE_NAME = "RightTriangle";

    public RightTriangle(double katetA, double sideB) {
        this.katetA = katetA;
        this.katetB = sideB;
    }

    @Override
    void chooseFigureColor(int randomColorNumber) {
        ColorSupplier colorSupplier = new ColorSupplier(randomColorNumber);
        rightTriangleColor = colorSupplier.getRandomColor();
    }

    @Override
    public double calculateArea() {
        rightTriangleArea = (katetA * katetB) / 2;
        rightTriangleArea = (double) Math.round(rightTriangleArea * 100) / 100;
        return rightTriangleArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FIGURE_NAME +
                ", area: " + rightTriangleArea +
                " sq.units, katetA: " + katetA +
                " units, katetB: " + katetB + " units" +
                ", color: " + rightTriangleColor);
    }
}
