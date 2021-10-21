package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Trapezoid;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 6;
    private static final int RANDOM_RADIUS = 15;
    private static final int DEFAULT_RADIUS = 10;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomTrapezoid();
            case 5:
                return getRandomTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(RANDOM_RADIUS));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(RANDOM_RADIUS));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor().toLowerCase(),
                 random.nextInt(RANDOM_RADIUS));
    }

    private Figure getRandomTrapezoid() {
        return new Trapezoid(colorSupplier.getRandomColor().toLowerCase(),
                 random.nextInt(RANDOM_RADIUS));
    }

    private Figure getRandomTriangle() {
        return new Triangle(colorSupplier.getRandomColor().toLowerCase(),
                 random.nextInt(RANDOM_RADIUS));
    }
}
