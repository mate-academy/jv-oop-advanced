package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure[] figures = new Figure[5];

    public Figure getRandomFigure() {
        final Figure square = new Square("Square",
                colorSupplier.getRandomColor(),
                randomValue());

        final Figure isoscelesTrapezoid = new IsoscelesTrapezoid("Isosceles Trapezoid",
                colorSupplier.getRandomColor(),
                randomValue(),
                randomValue(),
                randomValue());

        final Figure rightTriangle = new RightTriangle("Right Triangle",
                colorSupplier.getRandomColor(),
                randomValue(),
                randomValue());

        final Figure circle = new Circle("Circle",
                colorSupplier.getRandomColor(),
                randomValue());

        final Figure rectangle = new Rectangle("Rectangle",
                colorSupplier.getRandomColor(),
                randomValue(),
                randomValue());

        figures[0] = square;
        figures[1] = isoscelesTrapezoid;
        figures[2] = rightTriangle;
        figures[3] = circle;
        figures[4] = rectangle;
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("Default Circle", colorSupplier.getWhiteColor(), 10);
    }

    private int randomValue() {
        return random.nextInt(100);
    }
}
