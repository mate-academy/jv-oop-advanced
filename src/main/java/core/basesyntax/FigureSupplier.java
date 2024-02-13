package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES_TYPES = 5;
    private static final int SIZE_LIMIT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_COLOR = "White";

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int getRandomSize() {
        return random.nextInt(SIZE_LIMIT) + 1;
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int sideA = getRandomSize();
        switch (random.nextInt(MAX_FIGURES_TYPES) + 1) {
            case 1:
                return new Circle(randomColor, sideA);
            case 2:
                return new Square(randomColor, sideA);
            case 3:
                int rectangleSideB = getRandomSize();
                return new Rectangle(randomColor, sideA, rectangleSideB);
            case 4:
                int triangleSideB = getRandomSize();
                return new RightTriangle(randomColor, sideA, triangleSideB);
            case 5:
                int trapezoidSideB = getRandomSize();
                int trapezoidHeight = getRandomSize();
                return new IsoscelesTrapezoid(randomColor, sideA, trapezoidSideB, trapezoidHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
