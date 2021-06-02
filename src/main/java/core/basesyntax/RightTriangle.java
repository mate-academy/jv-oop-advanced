package core.basesyntax;

public class RightTriangle extends Shape {
    private double sideA;
    private double sideB;

    public RightTriangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double figureArea() {
        return sideA * sideB / 2;
    }

    @Override
    void drawFigure() {
        System.out.println(String.format("Figure: right triangle, area: %s, sideA: %s, sideB: %s,"
                + " color: %s", figureArea(), sideA, sideB, color));
    }
}
