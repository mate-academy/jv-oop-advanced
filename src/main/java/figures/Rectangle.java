package figures;

import behavior.ColorSupplier;
import behavior.Figure;
import behavior.GetAreaAble;

public class Rectangle extends Figure implements GetAreaAble {
    private final double sideA;
    private final double sideB;
    private final String name = "Rectangle";

    ColorSupplier colorSupplier = new ColorSupplier();

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
                + sideA + " units, sideB: " + sideB + " units, color: " + colorSupplier.getRandomColor();
    }
}
