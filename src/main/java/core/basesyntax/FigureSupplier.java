package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int OFFSET = 1;
    public static final int MAX_RANDOM = 100;
    public static final int DEFAULT_NUMBER = 10;
    public static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NUMBER, DEFAULT_COLOR);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_RANDOM) + OFFSET;
        return new Square(side, color);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_RANDOM) + OFFSET;
        return new Circle(radius, color);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(MAX_RANDOM) + OFFSET;
        int height = random.nextInt(MAX_RANDOM) + OFFSET;
        return new Rectangle(length, height, color);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_RANDOM) + OFFSET;
        int secondLeg = random.nextInt(MAX_RANDOM) + OFFSET;
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int upperBase = random.nextInt(MAX_RANDOM) + OFFSET;
        int lowerBase = random.nextInt(MAX_RANDOM) + OFFSET;
        int height = random.nextInt(MAX_RANDOM) + OFFSET;
        return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
    }
}
