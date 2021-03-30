package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class Rectangle extends Figure implements ColorSupplier, FigureSupplier {
    private Double sideB;

    public Rectangle() {
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public  Rectangle(double sideA, double sideB) {
        setSideA(sideA);
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return getSideA() * sideB;
    }
    @Override
    public String draw() {
        return "Figure: rectangle, area: " + area() + " sq. units, side a length: " + getSideA() + " units, side b length: " + sideB + " units, color: " + ColorSupplier.getColor();
    }
}
