package core.basesyntax.figures;

import core.basesyntax.model.Figure;
import core.basesyntax.services.ColorSupplier;
import core.basesyntax.services.FigureSupplier;

public class RightTriangle extends Figure {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();
    // Площа = (1/2) * катет1 * катет2
    private double firstLeg;
    private double secondLeg;

    @Override
    public double calculateArea() {
        firstLeg = figureSupplier.getRandomFigure();
        secondLeg = figureSupplier.getRandomFigure();
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        this.setColor(colorSupplier.getRandomColor());
        System.out.printf("Figure: right triangle, area: %.1f sq.units, "
                + "first leg: %.1f units, secondLeg: %.1f units, color: %s%n",
                calculateArea(), firstLeg, secondLeg, this.getColor());
    }
}
