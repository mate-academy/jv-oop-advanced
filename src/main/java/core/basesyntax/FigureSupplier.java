package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_VALUE_FOR_FIGURES = 26;
    private static final int MAX_VALUE_FOR_CIRCLE_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomSquare() {
        return new Square(getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES));

    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES));

    }

    public Figure getRandomCircle() {
        return new Circle(getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES));

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_VALUE_FOR_CIRCLE_RADIUS);
    }
}
