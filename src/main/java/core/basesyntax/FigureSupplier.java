package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int FIGURE_TYPE_COUNT = 5;
    private static final ColorSupplier sp = new ColorSupplier();

    private Circle getRandomCircle() {
        return new Circle(
                random.nextInt(22),
                sp.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                random.nextInt(25),
                random.nextInt(24),
                sp.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(
                random.nextInt(25),
                random.nextInt(36),
                sp.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(
                random.nextInt(33),
                random.nextInt(25),
                sp.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(
                random.nextInt(25),
                sp.getRandomColor());
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPE_COUNT);
        switch (figureType) {
            case 1: {
                return getRandomCircle();
            }
            case 2: {
                return getRandomIsoscelesTrapezoid();
            }
            case 3: {
                return getRandomRectangle();
            }
            case 4: {
                return getRandomRightTriangle();
            }
            default: {
                return getRandomSquare();
            }
        }
    }
}
