package core.basesyntax.figures;

import core.basesyntax.model.Figure;
import core.basesyntax.services.ColorSupplier;
import core.basesyntax.services.FigureSupplier;

public class Rectangle extends Figure {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();
    // Площа = довжина * ширина
    private double length;
    private double width;

    @Override
    public double calculateArea() {
        length = figureSupplier.getRandomFigure();
        width = figureSupplier.getRandomFigure();
        return length * width;
    }

    @Override
    public void draw() {
        this.setColor(colorSupplier.getRandomColor());
        System.out.printf("Figure: rectangle, area: %.1f sq.units, "
                + "length: %.1f units, width: %.1f units, color: %s%n",
                calculateArea(), length, width, this.getColor());
    }
}
