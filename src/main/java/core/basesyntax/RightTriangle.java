package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setType("RightTriangle");
        super.setColor(color);
    }

    @Override
    public double area() {
        return sideA * sideB / 2.0;
    }

    public void info() {
        System.out.printf("Figure: %s, area: %s sq.units, sideA: %s units, sideB: %s units, "
                + "color: %s%n", getType(), area(), sideA, sideB, getColor());
    }
}

