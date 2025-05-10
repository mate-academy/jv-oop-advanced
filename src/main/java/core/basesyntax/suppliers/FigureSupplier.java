package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int RANDOM_FIGURE_MAX_LENGTH = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FIGURES_NUMBER);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt(),
                getRandomInt());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomInt());
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(DEFAULT_CIRCLE_COLOR), DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomInt() {
        return random.nextInt(RANDOM_FIGURE_MAX_LENGTH);
    }
}
