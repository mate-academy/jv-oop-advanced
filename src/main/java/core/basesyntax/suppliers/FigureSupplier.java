package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int RANDOM_NUMBER = 100;
    private static final int CIRCLE_RADIUS = 10;
    private static final int RANDOM_FIGURE_NUMBER = 5;
    private static final String CIRCLE_COLOR = "WHITE";
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(RANDOM_FIGURE_NUMBER);
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

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble(), getRandomDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(), getRandomInt());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private int getRandomInt() {
        return new Random().nextInt(RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
