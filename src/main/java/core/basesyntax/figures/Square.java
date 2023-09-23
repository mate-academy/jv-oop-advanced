package core.basesyntax.figures;

import core.basesyntax.model.Figure;
import core.basesyntax.services.ColorSupplier;
import core.basesyntax.services.FigureSupplier;

public class Square extends Figure {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();
    // Площа = сторона^2
    private double side;

    @Override
    public double calculateArea() {
        side = figureSupplier.getRandomFigure();
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        this.setColor(colorSupplier.getRandomColor());
        System.out.printf("Figure: square, area: %.1f sq.units, "
                + "side: %.1f units, color: %s%n", calculateArea(), side, this.getColor());
    }
}
