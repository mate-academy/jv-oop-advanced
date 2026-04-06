package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int sideA;
    private int sideB;
    private int height;

    IsoscelesTrapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) ((sideA + sideB) / 2) * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + ", side A: " + sideA
                + ", side B: " + sideB
                + ", height: " + height
                + ", color: " + getColor();
    }
}
