package core.basesyntax.helpers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 100;
    private static final FigureType[] FIGURES = FigureType.values();
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureName = FIGURES[colorSupplier.getRandom().nextInt(FIGURES.length)].name();
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
        return new Circle(
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE), colorSupplier.getRandomColor()
        );
    }

    private Square makeSquare() {
        return new Square(
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE), colorSupplier.getRandomColor()
        );
    }

    private Rectangle makeRectangle() {
        int width = colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE);
        int height = colorSupplier.getRandom().nextInt(width);
        return new Rectangle(width, height, colorSupplier.getRandomColor());
    }

    private RightTriangle makeRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE),
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE),
                colorSupplier.getRandomColor()
        );
    }

    private IsoscelesTrapezoid makeIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE),
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE),
                colorSupplier.getRandom().nextInt(MAX_FIGURE_SIZE),
                colorSupplier.getRandomColor()
        );
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
