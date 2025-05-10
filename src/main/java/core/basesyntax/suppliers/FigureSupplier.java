package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int NUMBER_OF_FIGURES = 5;
    public static final Figure DEFAULT_FIGURE = new Circle("WHITE", 10);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int number = getRandomInt(NUMBER_OF_FIGURES);
        switch (number) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure gerDefaultFigure() {
        return DEFAULT_FIGURE;
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomInt(MAX_RANDOM_VALUE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomInt(MAX_RANDOM_VALUE),
                getRandomInt(MAX_RANDOM_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(MAX_RANDOM_VALUE),
                getRandomInt(MAX_RANDOM_VALUE));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomInt(MAX_RANDOM_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomInt(MAX_RANDOM_VALUE),
                getRandomInt(MAX_RANDOM_VALUE),
                getRandomInt(MAX_RANDOM_VALUE));
    }

    private int getRandomInt(int maxNumber) {
        return random.nextInt(maxNumber) + 1;
    }
}
