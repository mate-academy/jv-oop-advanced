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
    private static final String DEFAULT_COLOR = "white";
    private static final int MAX_DIMENSION = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private FigureType getRandomFigureType() {
        int figureTypeIndex = random.nextInt(FigureType.values().length);
        return FigureType.values()[figureTypeIndex];
    }

    public Figure getRandomFigure() {
        int size1 = random.nextInt(MAX_DIMENSION) + 1;
        int size2 = random.nextInt(MAX_DIMENSION) + 1;
        int size3 = random.nextInt(MAX_DIMENSION) + 1;

        FigureType figureType = getRandomFigureType();
        return switch (figureType) {
            case CIRCLE -> new Circle(colorSupplier.getRandomColor(), size1);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), size1, size2, size3);
            case RECTANGLE -> new Rectangle(colorSupplier.getRandomColor(), size1, size2);
            case RIGHT_TRIANGLE -> new RightTriangle(colorSupplier.getRandomColor(), size1, size2);
            case SQUARE -> new Square(colorSupplier.getRandomColor(), size1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
