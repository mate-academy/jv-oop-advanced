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
        return new Circle(colorName, random.nextInt(MAX_RADIUS));
    }

    private Figure createRandomSquare() {
        return new Square(randomColorSupplier.getRandomColor(), random.nextInt(MAX_SIDE));
    }

    private Figure createRectangle() {
        return new Rectangle(randomColorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
    }

    private Figure createRandomRightTriangle() {
        return new RightTriangle(randomColorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
    }

    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.White.name(), DEFAULT_RADIUS);
    }
}
