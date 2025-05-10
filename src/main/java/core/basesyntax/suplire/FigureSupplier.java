package core.basesyntax.suplire;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int QUANTITY_FIGURE = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(QUANTITY_FIGURE);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getSquare();
            default:
                return getRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.toString(),DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),randomNumber());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomNumber(),
                randomNumber(),
                randomNumber());
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),randomNumber(),randomNumber());
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(),randomNumber());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),randomNumber(),
                randomNumber());
    }

    private int randomNumber() {
        return random.nextInt(100);
    }
}
