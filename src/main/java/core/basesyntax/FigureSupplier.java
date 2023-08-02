package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIDE_LENGTH = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
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

    private Figure getRandomSquare() {
        return new Square(random.nextDouble() * MAX_SIDE_LENGTH + 1,
                new ColorSupplier().getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextDouble() * MAX_SIDE_LENGTH + 1,
                random.nextDouble() * MAX_SIDE_LENGTH + 1, new ColorSupplier().getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextDouble() * MAX_SIDE_LENGTH + 1,
                random.nextDouble() * MAX_SIDE_LENGTH + 1, new ColorSupplier().getRandomColor());
    }

    private Figure getRandomCircle() {
        return new Circle("Random Circle", random.nextDouble() * MAX_SIDE_LENGTH + 1,
                new ColorSupplier().getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextDouble() * MAX_SIDE_LENGTH + 1,
                random.nextDouble() * MAX_SIDE_LENGTH + 1,
                random.nextDouble() * MAX_SIDE_LENGTH + 1,
                new ColorSupplier().getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle("Default Circle", DEFAULT_RADIUS, Color.WHITE);
    }
}
