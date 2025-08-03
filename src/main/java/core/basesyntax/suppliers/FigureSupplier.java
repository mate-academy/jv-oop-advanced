package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURE_COUNT)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case 1 -> new Square(colorSupplier.getRandomColor(), getRandomSize());
            case 2 -> new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize());
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomSize(), getRandomSize());
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomSize(), getRandomSize(), getRandomSize());
            default -> this.getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    private int getRandomSize() {
        return MIN_SIZE + random.nextInt(MAX_SIZE - MIN_SIZE + 1);
    }
}
