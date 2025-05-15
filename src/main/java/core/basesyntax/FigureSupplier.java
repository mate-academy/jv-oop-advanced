package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.impls.Circle;
import core.basesyntax.model.impls.IsoscelesTrapezoid;
import core.basesyntax.model.impls.Rectangle;
import core.basesyntax.model.impls.RightTriangle;
import core.basesyntax.model.impls.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Figures[] figures = Figures.values();

    public Figure getRandomFigure() {
        Figures figure = figures[random.nextInt(figures.length)];
        return switch (figure) {
            case CIRCLE -> new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case RECTANGLE -> new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            case SQUARE -> new Square(colorSupplier.getRandomColor(), random.nextDouble());
            case ISOSCELES_TRAPEZOID ->
                    new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(),
                            random.nextDouble(), random.nextDouble());
            case RIGHT_TRIANGLE ->
                    new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                            random.nextDouble());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
