package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq.units, SideA: "
                + sideA + " sq.units, sideB: "
                + sideB + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }
}
