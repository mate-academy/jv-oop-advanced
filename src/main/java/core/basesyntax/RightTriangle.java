package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(String color, int a, int b) {
        super(color);
        sideA = a;
        sideB = b;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.;
    }

    public String toString() {
        return "triangle, area: " + getArea()
                + " sq.units, firstLeg: " + sideA
                + " units, secondLeg: " + sideB
                + " units, color: " + color.toLowerCase();
    }
}
