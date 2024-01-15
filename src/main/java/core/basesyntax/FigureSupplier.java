package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_BOUND = 100;
    private static final int LOWER_BOUND = 1;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Colors.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(Figures.values().length);

        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new Circle(color, radius);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int width = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int height = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new Rectangle(color, width, height);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstSide = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int secondSide = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new RightTriangle(color, firstSide, secondSide);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new Square(color, side);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int firstSide = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int secondSide = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int height = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new IsoscelesTrapezoid(color, firstSide, secondSide, height);
    }
}
