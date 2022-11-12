package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 25;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_FIGURE_NUMBER = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(RANDOM_FIGURE_NUMBER);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_SIZE);
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }
}
