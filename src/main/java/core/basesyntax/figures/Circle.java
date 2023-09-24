package core.basesyntax.figures;

import core.basesyntax.model.Figure;
import core.basesyntax.services.ColorSupplier;
import core.basesyntax.services.FigureSupplier;

public class Circle extends Figure {
    private final double pi = 3.14;
    private double radius;

    @Override
    public double calculateArea() {
        radius = figureSupplier.getRandomFigure();
        return pi * radius;
    }

    @Override
    public void draw() {
        this.setColor(colorSupplier.getRandomColor());
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %.1f units, color: %s%n",
                calculateArea(), radius, this.getColor());
    }
}
