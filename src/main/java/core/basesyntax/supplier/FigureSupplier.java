package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANGE_BOUND = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = {
                new Circle(colorSupplier.getRandomColor(), random.nextInt(1, MAX_RANGE_BOUND)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_RANGE_BOUND),
                        random.nextInt(1, MAX_RANGE_BOUND), random.nextInt(1, MAX_RANGE_BOUND),
                        random.nextInt(1, MAX_RANGE_BOUND)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_RANGE_BOUND),
                        random.nextInt(1, MAX_RANGE_BOUND)),
                new Square(colorSupplier.getRandomColor(), random.nextInt(1, MAX_RANGE_BOUND)),
                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(1, MAX_RANGE_BOUND),
                        random.nextInt(1, MAX_RANGE_BOUND))
        };
        int index = random.nextInt(0, figures.length - 1);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

}
