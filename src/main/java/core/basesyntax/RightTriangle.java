package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: "
                + sideA + " units, secondLeg: " + sideB + " units, color: " + getColor());
    }
}
