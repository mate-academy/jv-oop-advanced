package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_VALUE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_RANDOM_VALUE)) {
            case 0: return getCircle();
            case 1: return getIsoscelesTrapezoid();
            case 2: return getRectangle();
            case 3: return getRightTriangle();
            case 4: return getSquare();
            case 5: return getCircle();
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomValue(),
                getRandomValue(),
                getRandomValue());
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomValue(),
                getRandomValue());
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }
}
