package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 5;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNum = random.nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
        return switch (randomNum) {
            case 1 -> new Circle(colorSupplier
                    .getRandomColor(), randomNum);
            case 2 -> new Square(colorSupplier
                    .getRandomColor(), randomNum);
            case 3 -> new Rectangle(colorSupplier
                    .getRandomColor(), randomNum, randomNum);
            case 4 -> new RightTriangle(colorSupplier
                    .getRandomColor(), randomNum);
            case 5 -> new IsoscelesTrapezoid(colorSupplier
                    .getRandomColor(), randomNum, randomNum);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_FIGURE_RADIUS);
    }
}
