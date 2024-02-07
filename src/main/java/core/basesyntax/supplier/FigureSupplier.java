package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int FIGURE_NUMBER = 5;
    private static final int RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_NUMBER);
        switch (figureIndex) {
            case 0:
                return createRandomCircle();
            case 1:
                return createRandomIsoscelesTrapezoid();
            case 2:
                return createRandomSquare();
            case 3:
                return createRandomRectangle();
            case 4:
            default:
                return createRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandom() {
        return random.nextInt(RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    private Figure createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandom());
    }

    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble(), getRandomDouble());
    }

    private Figure createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
    }

    private Figure createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandom());
    }

    private Figure createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble());
    }
}
