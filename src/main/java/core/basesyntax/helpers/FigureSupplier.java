package core.basesyntax.helpers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.interfaces.RandomNumber;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier implements RandomNumber {
    private static final int MAX_FIGURE_SIZE = 100;
    private static final FigureType[] FIGURES = FigureType.values();
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureName = FIGURES[getRandomNumber(random, FIGURES.length)].name();
        return switch (figureName) {
            case "CIRCLE" -> makeCircle();
            case "SQUARE" -> makeSquare();
            case "RECTANGLE" -> makeRectangle();
            case "RIGHT_TRIANGLE" -> makeRightTriangle();
            case "ISOSCELES_TRAPEZOID" -> makeIsoscelesTrapezoid();
            default -> null;
        };
    }

    private Circle makeCircle() {
        return new Circle(getRandomNumber(
                random, MAX_FIGURE_SIZE), colorSupplier.getRandomColor(random)
        );
    }

    private Square makeSquare() {
        return new Square(getRandomNumber(
                random, MAX_FIGURE_SIZE), colorSupplier.getRandomColor(random)
        );
    }

    private Rectangle makeRectangle() {
        int width = getRandomNumber(random, MAX_FIGURE_SIZE);
        int height = getRandomNumber(random, width);
        return new Rectangle(width, height, colorSupplier.getRandomColor(random));
    }

    private RightTriangle makeRightTriangle() {
        return new RightTriangle(
                getRandomNumber(random, MAX_FIGURE_SIZE),
                getRandomNumber(random, MAX_FIGURE_SIZE),
                colorSupplier.getRandomColor(random)
        );
    }

    private IsoscelesTrapezoid makeIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                getRandomNumber(random, MAX_FIGURE_SIZE),
                getRandomNumber(random, MAX_FIGURE_SIZE),
                getRandomNumber(random, MAX_FIGURE_SIZE),
                colorSupplier.getRandomColor(random)
        );
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
