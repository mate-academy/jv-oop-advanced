package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final int DEFAULT_CIRCLES_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(radius, color);
    }

    public Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int sideA = random.nextInt(MAX_RANDOM_NUMBER);
        int sideB = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(color, sideA, sideB);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        int upperSide = random.nextInt(MAX_RANDOM_NUMBER);
        int lowerSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(color, height, upperSide, lowerSide);
    }

    public Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(color, side);
    }

    public RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int secondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 5:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        int radius = DEFAULT_CIRCLES_RADIUS;
        return new Circle(radius, color);
    }
}
