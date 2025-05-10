package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int CONSTANT_RADIUS = 10;
    private static final int MAX_RANDOM = 30;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_AMOUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return new FigureSupplier().getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), CONSTANT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM));
    }
}

