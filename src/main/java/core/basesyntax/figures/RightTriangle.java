package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class RightTriangle extends Figure implements ColorSupplier, FigureSupplier {

    public RightTriangle(double sideA) {
        setSideA(sideA);

    }

    @Override
    public double area() {
        return  (Math.cbrt(3) / 4 * getSideA());
    }
    @Override
    public String draw() {
        return "Figure: right triangle, area: " + area() + " sq. units, side length: " + getSideA() + " units, color: " + ColorSupplier.getColor();
    }
}
