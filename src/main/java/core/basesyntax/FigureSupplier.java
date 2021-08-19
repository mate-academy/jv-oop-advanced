package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANDOM_SIDE = 50;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int someFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (someFigure) {
            case 0:
                return newCircle();
            case 1:
                return newRectangle();
            case 2:
                return newSquare();
            case 3:
                return newIsoscelesTrapezoid();
            default:
                return newRightTriangle();
        }

    }

    private Circle newCircle() {
        return new Circle(random.nextInt(RANDOM_SIDE));
    }

    private Rectangle newRectangle() {
        return new Rectangle(random.nextInt(RANDOM_SIDE),
                random.nextInt(RANDOM_SIDE));
    }

    private RightTriangle newRightTriangle() {
        return new RightTriangle(random.nextInt(RANDOM_SIDE),
                random.nextInt(RANDOM_SIDE));
    }

    private Square newSquare() {
        return new Square(random.nextInt(RANDOM_SIDE));
    }

    private IsoscelesTrapezoid newIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(RANDOM_SIDE),
                random.nextInt(RANDOM_SIDE),
                random.nextInt(RANDOM_SIDE));
    }
}
