package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, color: " + getColor());
    }
}
