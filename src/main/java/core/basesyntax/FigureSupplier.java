package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int MAX_INT = 25;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final String DEF_COLOR = "white";
    private static final int DEF_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES) + 1) {
            case 1: {
                return getRectangle();
            }
            case 2: {
                return getRightTriangle();
            }
            case 3: {
                return getCircle();
            }
            case 4: {
                return getSquare();
            }
            case 5: {
                return getIsoscelesTrapezoid();
            }
            default:
                return getCircle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_COLOR, DEF_RADIUS);
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1);
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1);
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1,
                random.nextInt(MAX_INT) + 1);
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_INT) + 1);
    }
}
