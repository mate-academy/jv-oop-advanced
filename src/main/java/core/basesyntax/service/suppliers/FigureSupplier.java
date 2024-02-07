package core.basesyntax.service.suppliers;

import core.basesyntax.Circle;
import core.basesyntax.Figure;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_NUMBER = 50;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(4);
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

    private int getRandomInt() {
        return new Random().nextInt(DEFAULT_NUMBER);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomInt());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                getRandomInt());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),
                getRandomInt());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt(),
                getRandomInt());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),getRandomInt());
    }
}
