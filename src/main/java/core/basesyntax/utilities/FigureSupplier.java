package core.basesyntax.utilities;

import core.basesyntax.figure.core.Circle;
import core.basesyntax.figure.core.Figure;
import core.basesyntax.figure.core.IsoscelesTrapezoid;
import core.basesyntax.figure.core.Rectangle;
import core.basesyntax.figure.core.RightTriangle;
import core.basesyntax.figure.core.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_RANGE = 10;
    private static final int NUMBER_OF_TYPES_OF_FIGURE = 5;
    private static Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure returnFigure;
        switch (random.nextInt(NUMBER_OF_TYPES_OF_FIGURE)) {
            case (0):
                returnFigure = getRandomCircle(colorSupplier);
                break;
            case (1):
                returnFigure = getRandomRightTriangle(colorSupplier);
                break;
            case (2):
                returnFigure = getRandomRectangle(colorSupplier);
                break;
            case (3):
                returnFigure = getRandomIsoscelesTrapezoid(colorSupplier);
                break;
            case (4):
                returnFigure = getRandomSquare(colorSupplier);
                break;
            default:
                returnFigure = getRandomSquare(colorSupplier);
        }
        return returnFigure;
    }

    private Circle getRandomCircle(ColorSupplier colorSupplier) {
        int circleRadius = random.nextInt(RANDOM_RANGE);

        return new Circle(colorSupplier.getRandomColor(), circleRadius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(ColorSupplier colorSupplier) {
        int topOfIsoscelesTrapezoid = random.nextInt(RANDOM_RANGE);
        int bottomOfIsoscelesTrapezoid = random.nextInt(RANDOM_RANGE);
        int heightOfIsoscelesTrapezoid = random.nextInt(RANDOM_RANGE);

        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                topOfIsoscelesTrapezoid, bottomOfIsoscelesTrapezoid,
                heightOfIsoscelesTrapezoid);
    }

    private Rectangle getRandomRectangle(ColorSupplier colorSupplier) {
        int width = random.nextInt(RANDOM_RANGE);
        int length = random.nextInt(RANDOM_RANGE);

        return new Rectangle(colorSupplier.getRandomColor(), width, length);
    }

    private RightTriangle getRandomRightTriangle(ColorSupplier colorSupplier) {
        int sideA = random.nextInt(RANDOM_RANGE);
        int sideB = random.nextInt(RANDOM_RANGE);

        return new RightTriangle(colorSupplier.getRandomColor(), sideA, sideB);
    }

    private Square getRandomSquare(ColorSupplier colorSupplier) {
        int side = random.nextInt(RANDOM_RANGE);

        return new Square(colorSupplier.getRandomColor(), side);
    }
}
