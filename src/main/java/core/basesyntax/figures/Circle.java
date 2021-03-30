package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class Circle extends Figure implements ColorSupplier, FigureSupplier {

    public Circle(double radius) {
        setSideA(radius);
    }

    public double getRadius() {
        return getSideA();
    }

    @Override
    public double area() {
        return  (Math.PI * getRadius() * getRadius());
    }
    @Override
    public String draw() {
        return "Figure: circle, area: " + area() + " sq. units, radius length: " + getRadius() + " units, color: " + ColorSupplier.getColor();
    }

}
