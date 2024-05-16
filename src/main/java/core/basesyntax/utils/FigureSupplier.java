package core.basesyntax.utils;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_DIMENSION = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        return switch (figureType) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION) + 1);
            case 1 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION) + 1,
                    random.nextInt(MAX_DIMENSION) + 1,
                    random.nextInt(MAX_DIMENSION) + 1);
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION) + 1,
                    random.nextInt(MAX_DIMENSION) + 1);
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION) + 1,
                    random.nextInt(MAX_DIMENSION) + 1);
            case 4 -> new Square(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION) + 1);
            default -> null;
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

}
