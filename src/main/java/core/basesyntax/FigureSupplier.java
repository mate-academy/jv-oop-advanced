package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomValue());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomValue());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomValue(),getRandomValue());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomValue(),getRandomValue(), getRandomValue());
    }
}

