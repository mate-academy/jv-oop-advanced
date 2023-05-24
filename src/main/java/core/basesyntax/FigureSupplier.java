package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.White.name();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int index = this.random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 1:
                return getCircle();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
                return getIsoscelesTrapezoid();
            case 5:
                return getSquare();
            default:
                return getRightTriangle();
        }
    }

    private Figure getCircle() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        Figure figure = new Circle(firstValue);
        ColorSupplier colorSupplier = new ColorSupplier();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getRectangle() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int secondValue = this.random.nextInt(MAX_RANDOM_VALUE);
        Figure figure = new Rectangle(firstValue,secondValue);
        ColorSupplier colorSupplier = new ColorSupplier();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getIsoscelesTrapezoid() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int secondValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int thirdValue = this.random.nextInt(MAX_RANDOM_VALUE);
        Figure figure = new IsoscelesTrapezoid(firstValue,secondValue,thirdValue);
        ColorSupplier colorSupplier = new ColorSupplier();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getRightTriangle() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int secondValue = this.random.nextInt(MAX_RANDOM_VALUE);
        Figure figure = new RightTriangle(firstValue,secondValue);
        ColorSupplier colorSupplier = new ColorSupplier();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    private Figure getSquare() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        Figure figure = new Square(firstValue);
        ColorSupplier colorSupplier = new ColorSupplier();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
