package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RADIUS = 25;
    private static final int MAX_SIDE = 25;
    private static final int MAX_LENGTH = 25;
    private final ColorSupplier randomColorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.random = new Random();
        this.randomColorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return createRandomCircle();
            case 1:
                return createRectangle();
            case 2:
                return createRandomSquare();
            case 3:
                return createRandomRightTriangle();
            default:
                return createRandomIsoscelesTrapezoid();
        }
    }

    private Figure createRandomCircle() {
        Color randomColor = randomColorSupplier.getRandomColor();
        String colorName = randomColor.name();
        int radius = random.nextInt(MAX_RADIUS);
        return new Circle(colorName, radius);
    }

    private Figure createRandomSquare() {
        Color randomColor = randomColorSupplier.getRandomColor();
        int side = random.nextInt(MAX_SIDE);
        return new Square(randomColor, side);
    }

    private Figure createRectangle() {
        Color randomColor = randomColorSupplier.getRandomColor();
        int width = random.nextInt(MAX_SIDE);
        int height = random.nextInt(MAX_SIDE);
        return new Rectangle(randomColor, width, height);
    }

    private Figure createRandomRightTriangle() {
        Color randomColor = randomColorSupplier.getRandomColor();
        int base = random.nextInt(MAX_SIDE);
        int height = random.nextInt(MAX_SIDE);
        return new RightTriangle(randomColor, base, height);
    }

    private Figure createRandomIsoscelesTrapezoid() {
        Color randomColor = randomColorSupplier.getRandomColor();
        int topBase = random.nextInt(MAX_LENGTH);
        int bottomBase = random.nextInt(MAX_LENGTH);
        int height = random.nextInt(MAX_LENGTH);
        return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
