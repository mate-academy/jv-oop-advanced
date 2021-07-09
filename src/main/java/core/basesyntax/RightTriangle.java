package core.basesyntax;

public class RightTriangle extends Figure {
    private double katetA;
    private double katetB;
    private String rightTriangleColor;

    public RightTriangle(double katetA, double sideB, String rightTriangleColor) {
        this.katetA = katetA;
        this.katetB = sideB;
        this.rightTriangleColor = rightTriangleColor;
    }

    @Override
    public double calculateArea() {
        double rightTriangleArea = (katetA * katetB) / 2;
        rightTriangleArea = (double) Math.round(rightTriangleArea * 100) / 100;
        return rightTriangleArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + RightTriangle.class.getSimpleName()
                + ", area: " + calculateArea()
                + " sq.units, katetA: " + katetA
                + " units, katetB: " + katetB + " units"
                + ", color: " + rightTriangleColor);
    }
}
