package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (double) sideA * sideB / 2;
    }
}
