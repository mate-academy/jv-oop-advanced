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
    public double calculateArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %s, sideA: %s, sideB: %s,"
                + " color: %s%n", calculateArea(), sideA, sideB, getColor());
    }
}
