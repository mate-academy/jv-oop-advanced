package core.basesyntax.util;

import core.basesyntax.model.Figure;
import core.basesyntax.model.impl.Circle;
import core.basesyntax.model.impl.IsoscelesTrapezoid;
import core.basesyntax.model.impl.Rectangle;
import core.basesyntax.model.impl.RightTriangle;
import core.basesyntax.model.impl.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int QUANTITY_FIGURE = 5;
    private static final int MIN_LENGTH_FIGURE = 1;
    private static final int MAX_LENGTH_FIGURE = 100;
    private static final int DEFAULT_RADIUS_CIRCLE = 10;
    private static final String DEFAULT_COLOR_CIRCLE = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int indexFigure = random.nextInt(QUANTITY_FIGURE);

        return switch (indexFigure) {
            case 0 -> new Circle(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
                    );
            case 1 -> new IsoscelesTrapezoid(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
                    );
            case 2 -> new Rectangle(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1),
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
            );
            case 3 -> new RightTriangle(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
            );
            default -> new Square(
                    color,
                    random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1)
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR_CIRCLE, DEFAULT_RADIUS_CIRCLE);
    }
}
