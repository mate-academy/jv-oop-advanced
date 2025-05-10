package core.basesyntax.supliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int FIGURE_INDEX = 4;
    private static final int DEFAULT_RADIUS = 10;
    private static final String COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FIGURE_INDEX);
        switch (figureIndex) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getRectangle();
            default:
                return getRightTriangle();
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }
}
