package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {

    private Double sideA;
    private Double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        setColor(color);
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (getSideA() + getSideB()) / 2 * getHeight();
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq. units, side a length: "
                + getSideA() + " units, side b length: " + getSideB() + " units, height length: "
                + getHeight() + " units, color: " + getColor();
    }
}
