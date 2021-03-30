package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class Square extends Figure implements ColorSupplier, FigureSupplier {

    public Square(double sideA) {
        setSideA(sideA);

    }

    @Override
    public double area() {
        return getSideA() * getSideA();
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + area() + " sq. units, side length: " + getSideA() + " units, color: " + ColorSupplier.getColor();
    }
}
