package figures;

import behavior.Figure;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private String name = "Rectangle";

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, color: " + getRandomColor();
    }
}
