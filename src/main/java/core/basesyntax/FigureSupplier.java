package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURE = 5;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color;
    private double randomValue;

    public Figure getRandomFigure() {
        switch (random.nextInt(COUNT_OF_FIGURE)) {
            case 0: return createCircle();
            case 1: return createRightTriangle();
            case 2: return createSquare();
            case 3: return createRectangle();
            case 4: return createIsoscelesTrapezoid();
            default: return createSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure createCircle() {
        color = colorSupplier.getRandomColor();
        randomValue = random.nextDouble();

        return new Circle(color, randomValue);
    }

    private Figure createRightTriangle() {
        color = colorSupplier.getRandomColor();
        randomValue = random.nextDouble();
        return new RightTriangle(color,
                randomValue,
                randomValue);
    }

    private Figure createSquare() {
        color = colorSupplier.getRandomColor();
        randomValue = random.nextDouble();
        return new Square(color, randomValue);
    }

    private Figure createRectangle() {
        color = colorSupplier.getRandomColor();
        randomValue = random.nextDouble();
        return new Rectangle(color,
                randomValue,
                randomValue);
    }

    private Figure createIsoscelesTrapezoid() {
        color = colorSupplier.getRandomColor();
        randomValue = random.nextDouble();
        return new IsoscelesTrapezoid(color,
                randomValue,
                randomValue,
                randomValue);
    }
}
