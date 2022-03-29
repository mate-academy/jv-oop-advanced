package core.basesyntax.service;

import core.basesyntax.Figure;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.FigureType;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int defaultRadius = 10;
    public static final Color defaultColor = Color.WHITE;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        FigureType randomFigureType = FigureType.values()[figureNumber];
        switch (randomFigureType) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(10), random.nextInt(10));
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(10), random.nextInt(10));
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(10), random.nextInt(10), random.nextInt(10));
    }
}
