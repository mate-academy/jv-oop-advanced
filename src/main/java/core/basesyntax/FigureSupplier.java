package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 50;
    private static final int FIGURE_COUNT = 5;

    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT) + 1) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomCircle();
            case 5:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Square getRandomSquare() {
        return new Square(color.getRandomColor(),
                random.nextInt(MAX_LENGTH) + 1);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(color.getRandomColor(),
                random.nextInt(MAX_LENGTH) + 1,
                random.nextInt(MAX_LENGTH) + 1);
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(color.getRandomColor(),
                random.nextInt(MAX_LENGTH) + 1,
                random.nextInt(MAX_LENGTH) + 1);
    }

    private Circle getRandomCircle() {
        return new Circle(color.getRandomColor(),
                random.nextInt(MAX_LENGTH) + 1);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(color.getRandomColor(), random.nextInt(MAX_LENGTH) + 1,
                random.nextInt(MAX_LENGTH) + 1, random.nextInt(MAX_LENGTH) + 1,
                random.nextInt(MAX_LENGTH) + 1);
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), 10);

    }
}
