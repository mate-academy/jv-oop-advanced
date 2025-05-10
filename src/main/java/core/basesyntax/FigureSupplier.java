package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_BOND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        String type = getFigureType();
        String color = colorSupplier.getRandomColor();

        switch (FigureList.valueOf(type)) {
            case CIRCLE:
                return getCircle(color);
            case SQUARE:
                return getSquare(color);
            case RECTANGLE:
                return getRectangle(color);
            case RIGHT_TRIANGLE:
                return getRightTriangle(color);
            default:
                return getIsoscelesTrapezoid(color);
        }
    }

    private String getFigureType() {
        return FigureList.values()[random.nextInt(FigureList.values().length)].name();
    }

    private Figure getSquare(String color) {
        return new Square(color, random.nextInt(DEFAULT_BOND));
    }

    private Figure getRectangle(String color) {
        return new Rectangle(color, random.nextInt(DEFAULT_BOND), random.nextInt(DEFAULT_BOND));
    }

    private Figure getRightTriangle(String color) {
        return new RightTriangle(color, random.nextInt(DEFAULT_BOND), random.nextInt(DEFAULT_BOND));
    }

    private Figure getIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextInt(DEFAULT_BOND),
                random.nextInt(DEFAULT_BOND), random.nextInt(DEFAULT_BOND));
    }

    private Figure getCircle(String color) {
        return new Circle(color, random.nextInt(DEFAULT_BOND));
    }
}
