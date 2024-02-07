package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUE = 50;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color COLOR = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRectangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, COLOR);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }

    private RightTriangle getRandomRightTriangle() {
        int legA = random.nextInt(MAX_VALUE);
        int legB = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(legA, legB, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int height = random.nextInt(MAX_VALUE);
        int base = random.nextInt(MAX_VALUE);
        int upperSide = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(height, base, upperSide, color);
    }

    private Rectangle getRandomRectangle() {
        int sideA = random.nextInt(MAX_VALUE);
        int sideB = random.nextInt(MAX_VALUE);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(sideA, sideB, color);
    }
}
