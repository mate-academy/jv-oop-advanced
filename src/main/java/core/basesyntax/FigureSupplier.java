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
    private static final int SIDE_LENGTH_LIMIT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_COLOR = "White";

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int sideA = getRandomSideLength();
        Figure figure;
        switch (random.nextInt(MAX_FIGURES_TYPES) + 1) {
            case 1:
                figure = new Circle(randomColor, sideA);
                break;
            case 2:
                figure = new Square(randomColor, sideA);
                break;
            case 3:
                int rectangleSideB = getRandomSideLength();
                figure = new Rectangle(randomColor, sideA, rectangleSideB);
                break;
            case 4:
                int triangleSideB = getRandomSideLength();
                figure = new RightTriangle(randomColor, sideA, triangleSideB);
                break;
            case 5:
                int trapezoidSideB = getRandomSideLength();
                int trapezoidHeight = getRandomSideLength();
                figure = new IsoscelesTrapezoid(randomColor, sideA,
                                                trapezoidSideB, trapezoidHeight);
                break;
            default:
                figure = getDefaultFigure();
        }
        return figure;
    }

    private int getRandomSideLength() {
        return random.nextInt(SIDE_LENGTH_LIMIT) + 1;
    }
}
