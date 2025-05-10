package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final int number = new Random().nextInt(MAX_COUNT);
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public static double getRandomSide() {
        return number;
    }

    public String randomColor() {
        return colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        final int index = new Random().nextInt(MAX_COUNT);
        switch (index) {
            case 0:
                return new Circle(getRandomSide(), randomColor().toLowerCase());
            case 1:
                return new Rectangle(getRandomSide(), getRandomSide(), randomColor().toLowerCase());
            case 2:
                return new IsoscelesTrapezoid(getRandomSide(), getRandomSide(), getRandomSide(),
                        randomColor().toLowerCase());
            case 3:
                return new RightTriangle(getRandomSide(),
                        getRandomSide(), randomColor().toLowerCase());
            case 4:
                return new Square(getRandomSide(), randomColor().toLowerCase());
            default:
                return getDefaultFigure();
        }
    }
}
