package main;

import core.basesyntax.Circle;
import core.basesyntax.Figure;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_INT = 25;
    private static final String CIRCLE_COLOR = Colors.WHITE.name().toLowerCase();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURES_NUMBER = 5;

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS,CIRCLE_COLOR);
    }

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(FIGURES_NUMBER);
        switch (indexOfFigure) {
            case 0:
                return getRandomIsoscelesTrapezoid();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomRectangle();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_INT),
                colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT));
    }
}


