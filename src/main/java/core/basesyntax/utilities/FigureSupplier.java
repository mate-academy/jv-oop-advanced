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

    public Figure getRandomFigure() {

        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure returnFigure;
        switch (random.nextInt(NUMBER_OF_TYPES_OF_FIGURE)) {
            case (0):
                returnFigure =
                        new Circle(colorSupplier.getRandomColor(), random.nextInt(RANDOM_RANGE));
                break;
            case (1):
                returnFigure =
                        new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM_RANGE));
                break;
            case (2):
                returnFigure =
                        new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE),
                                random.nextInt(RANDOM_RANGE));
                break;
            case (3):
                returnFigure =
                        new Rectangle(colorSupplier.getRandomColor(),
                                random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE));
                break;
            case (4):
                returnFigure =
                        new RightTriangle(colorSupplier.getRandomColor(),
                                random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE));
                break;
            default:
                returnFigure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE));
        }
        return returnFigure;
    }
}
