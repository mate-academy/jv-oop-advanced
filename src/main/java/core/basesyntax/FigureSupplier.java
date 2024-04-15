package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 4;
    private static final int MAX_VALUE_FOR_RANDOM_FIGURE = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURE_AMOUNT)) {
            case 0 -> getRandomIsoscelesTrapezoid();
            case 1 -> getRandomRectangle();
            case 2 -> getRandomRightRectangle();
            default -> getRandomCircle();
        };
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }

    private Figure getRandomRightRectangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }
}
