package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + Math.round(getArea()) + " sq. units, side a: "
                + Math.round(getSideA()) + " units, color: "
                + getColor();
    }
}
