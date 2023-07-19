package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 15;
    private static final int NUMBER_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_FIGURE)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    private RightTriangle getRandomRightTriangle() {
        int side = random.nextInt(MAX_SIZE) + 1;
        return new RightTriangle(colorSupplier.getRandomColor(), side);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topBasis = random.nextInt(MAX_SIZE) + 1;
        int bottomBasis = random.nextInt(MAX_SIZE) + 1;
        int side = random.nextInt(MAX_SIZE) + 1;
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                topBasis, bottomBasis, side);
    }

    private Rectangle getRandomRectangle() {
        int width = random.nextInt(MAX_SIZE) + 1;
        int height = random.nextInt(MAX_SIZE) + 1;
        return new Rectangle(colorSupplier.getRandomColor(), width, height);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_SIZE) + 1;
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_SIZE) + 1;
        return new Square(colorSupplier.getRandomColor(), side);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
