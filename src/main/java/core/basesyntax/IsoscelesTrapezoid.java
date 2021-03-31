package core.basesyntax;

import core.basesyntax.interfaces.Calculatable;
import core.basesyntax.interfaces.Drawable;

public class IsoscelesTrapezoid extends Figure implements Calculatable, Drawable {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String name, Enum color, double sideA, double sideB, double height) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getLegs() {
        return height;
    }

    public void setLegs(double legs) {
        this.height = legs;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * (height) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "sideA: " + String.format("%.2f", sideA)
                + " sideB: " + String.format("%.2f", sideB)
                + " height: " + String.format("%.2f", height)
                + " units, " + "color: " + getColor());
    }
}
