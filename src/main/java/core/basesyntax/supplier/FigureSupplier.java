package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURУS_NUMBER = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 5;
    private static final int NUMBER_RANGE = 50;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURУS_NUMBER)) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createIsoscelesTrapezoid();
            default:
                return createCircle();
        }
    }

    private Figure createSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private Figure createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomInt(), getRandomInt());
    }

    private Figure createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                getRandomInt());
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(), getRandomInt(), getRandomInt());
    }

    private Figure createCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomInt() {
        return random.nextInt(NUMBER_RANGE) + 1;
    }
}
