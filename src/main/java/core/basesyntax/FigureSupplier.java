package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final int CASE_MAX_SIZE = 4;
    private final Random random = new Random();
    private final int caseRandom = random.nextInt(CASE_MAX_SIZE);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
    }

    public Figure getRandomFigure() {
        switch (caseRandom) {
            case 1: return getRandomSquare();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            default: return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
