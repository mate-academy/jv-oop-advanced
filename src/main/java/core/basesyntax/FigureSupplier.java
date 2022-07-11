package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_PROPERTY_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String defaultColor = Color.WHITE.name();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_NUMBER);

        switch (index) {
            case 1:
                return getRandomCircle(getRandomProperty());
            case 2:
                return getRandomSquare(getRandomProperty());
            case 3:
                return getRandomRectangle(getRandomProperty(), getRandomProperty());
            case 4:
                return getRandomRightTriangle(getRandomProperty(), getRandomProperty());
            default:
                return getRandomIsoscelesTrapezoid(getRandomProperty(), getRandomProperty(),
                        getRandomProperty());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }

    private Figure getRandomSquare(int property) {
        return new Square(colorSupplier.getRandomColor(), property);
    }

    private Figure getRandomCircle(int property) {
        return new Circle(colorSupplier.getRandomColor(), property);
    }

    private Figure getRandomRectangle(int side, int height) {
        return new Rectangle(colorSupplier.getRandomColor(), side, height);
    }

    private Figure getRandomRightTriangle(int firstSide, int secondSide) {
        return new RightTriangle(colorSupplier.getRandomColor(), firstSide, secondSide);
    }

    private Figure getRandomIsoscelesTrapezoid(int firstSide, int secondSide, int height) {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide, secondSide,
                height);
    }

    private int getRandomProperty() {
        return random.nextInt(MAX_PROPERTY_VALUE);
    }
}
