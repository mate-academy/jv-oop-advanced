package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {

    private Double sideA;
    private Double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq. units, side a length: "
                + getSideA() + " units, side b length: " + getSideB() + " units, color: "
                + getColor();
    }
}
