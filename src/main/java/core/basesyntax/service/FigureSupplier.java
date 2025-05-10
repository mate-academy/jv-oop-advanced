package core.basesyntax.service;

import core.basesyntax.entity.Color;
import core.basesyntax.entity.figure.Circle;
import core.basesyntax.entity.figure.Figure;
import core.basesyntax.entity.figure.IsoscelesTrapezoid;
import core.basesyntax.entity.figure.Rectangle;
import core.basesyntax.entity.figure.RightTriangle;
import core.basesyntax.entity.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Figure DEFAULT_FIGURE = new Circle(Color.WHITE.name(), 10);
    private static final int IMPLEMENTED_FIGURES_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(IMPLEMENTED_FIGURES_COUNT)) {
            case 0:
                return generateCircle();
            case 1:
                return generateSquare();
            case 2:
                return generateRectangle();
            case 3:
                return generateRightTriangle();
            case 4:
                return generateIsoscelesTrapezoid();
            default:
                return DEFAULT_FIGURE;
        }
    }

    private Figure generateCircle() {
        int radius = random.nextInt(MAX_RANDOM_VALUE);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Figure generateSquare() {
        int side = random.nextInt(MAX_RANDOM_VALUE);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Figure generateRectangle() {
        int length = random.nextInt(MAX_RANDOM_VALUE);
        int width = random.nextInt(MAX_RANDOM_VALUE);
        return new Rectangle(colorSupplier.getRandomColor(), length, width);
    }

    private Figure generateRightTriangle() {
        int height = random.nextInt(MAX_RANDOM_VALUE);
        int base = random.nextInt(MAX_RANDOM_VALUE);
        return new RightTriangle(colorSupplier.getRandomColor(), height, base);
    }

    private Figure generateIsoscelesTrapezoid() {
        int bottomBase = random.nextInt(MAX_RANDOM_VALUE);
        int topBase = random.nextInt(MAX_RANDOM_VALUE);
        int height = random.nextInt(MAX_RANDOM_VALUE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), bottomBase, topBase, height);
    }
}
