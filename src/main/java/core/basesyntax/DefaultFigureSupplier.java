package core.basesyntax;

import java.util.Random;

public class DefaultFigureSupplier implements FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return prepareSquare();
            case 1:
                return prepareRectangle();
            case 2:
                return prepareRightTriangle();
            case 3:
                return prepareCircle();
            case 4:
                return prepareIsoscelesTrapezoid();
            default:
                throw new IllegalStateException();
        }
    }

    private Square prepareSquare() {
        double side = random.nextInt(MAX_RANDOM_VALUE) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }

    private Rectangle prepareRectangle() {
        double width = random.nextInt(MAX_RANDOM_VALUE) + 1;
        double height = random.nextInt(MAX_RANDOM_VALUE) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(width, height, color);
    }

    private RightTriangle prepareRightTriangle() {
        double firstLeg = random.nextInt(MAX_RANDOM_VALUE) + 1;
        double secondLeg = random.nextInt(MAX_RANDOM_VALUE) + 1;
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Circle prepareCircle() {
        double radius = random.nextInt(MAX_RANDOM_VALUE) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        double upperBase = random.nextInt(MAX_RANDOM_VALUE) + 1;
        double lowerBase = random.nextInt(MAX_RANDOM_VALUE) + 1;
        double height = random.nextInt(MAX_RANDOM_VALUE) + 1;
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
    }

    public Figure getDefaultFigure() {
        double defaultRadius = 10.0;
        Color defaultColor = Color.WHITE;
        return new Circle(defaultRadius, defaultColor);
    }
}
