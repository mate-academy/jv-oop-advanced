package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {

    private Double sideA;

    public Square(String color, double sideA) {
        super(color);
        this.sideA = sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideA();
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq. units, side length: "
                + getSideA() + " units, color: " + getColor();
    }
}
