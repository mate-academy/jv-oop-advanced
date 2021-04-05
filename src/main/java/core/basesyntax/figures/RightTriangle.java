package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {

    private Double sideA;
    private String color;

    public RightTriangle(String color, double sideA) {
        super(color);
        this.sideA = sideA;;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getArea() {
        return (Math.cbrt(3) / 4 * getSideA());
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea() + " sq. units, side length: "
                + getSideA() + " units, color: " + getColor();
    }
}
