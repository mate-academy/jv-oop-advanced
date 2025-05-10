package core.basesyntax.util;

import core.basesyntax.model.Color;
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
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int indexFigure = random.nextInt(QUANTITY_FIGURE);

        return switch (indexFigure) {
            case 0 -> new Circle(
                    color,
                    getRandomSide()
                    );
            case 1 -> new IsoscelesTrapezoid(
                    color,
                    getRandomSide(),
                    getRandomSide(),
                    getRandomSide()
                    );
            case 2 -> new Rectangle(
                    color,
                    getRandomSide(),
                    getRandomSide()
            );
            case 3 -> new RightTriangle(
                    color,
                    getRandomSide()
            );
            default -> new Square(
                    color,
                    getRandomSide()
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomSide() {
        return random.nextInt(MIN_LENGTH_FIGURE, MAX_LENGTH_FIGURE + 1);
    }
}
