package core.basesyntax.figures;

import core.basesyntax.model.Figure;
import core.basesyntax.services.ColorSupplier;
import core.basesyntax.services.FigureSupplier;

public class IsoscelesTrapezoid extends Figure {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();
    /*
    Площа = (1/2) * h * (a + b),

    де:

    "h" - висота трапеції,
    "a" - довжина нижньої основи,
    "b" - длина верхньої основи.
     */
    private double height;
    private double upperBase;
    private double lowerBase;

    @Override
    public double calculateArea() {
        height = figureSupplier.getRandomFigure();
        upperBase = figureSupplier.getRandomFigure();
        lowerBase = figureSupplier.getRandomFigure();
        return 0.5 * height * (upperBase + lowerBase);
    }

    @Override
    public void draw() {
        this.setColor(colorSupplier.getRandomColor());
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units, "
                + "height: %.1f units, upper base: %.1f units, lower base: %.1f units, color: %s%n",
                calculateArea(), height, upperBase, lowerBase, this.getColor());
    }
}
