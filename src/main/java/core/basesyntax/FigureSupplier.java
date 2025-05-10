package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANDOM_RANGE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(RANDOM_RANGE), colorSupplier.getRandomColor().toString());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(RANDOM_RANGE),
                colorSupplier.getRandomColor().toString());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(RANDOM_RANGE),
                random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE),
                colorSupplier.getRandomColor().toString());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE),
                colorSupplier.getRandomColor().toString());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(RANDOM_RANGE),random.nextInt(RANDOM_RANGE),
                colorSupplier.getRandomColor().toString());
    }
}
