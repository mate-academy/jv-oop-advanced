package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    enum Figures {
        CIRCLE,
        ISOSCELES_TRAPEZOID,
        RECTANGLE,
        RIGHT_TRIANGLE,
        SQUARE
    }

    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 50;
    private static final int STATIC_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figures.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        switch (Figures.values()[index]) {
            case CIRCLE -> {
                return new Circle(color, getRandomNumber());
            }
            case SQUARE -> {
                return new Square(color, getRandomNumber());
            }
            case RECTANGLE -> {
                return new Rectangle(color, getRandomNumber(), getRandomNumber());
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(color, getRandomNumber(),getRandomNumber());
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(color, getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            }
            default -> {
                return null;
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorSupplier.Color.WHITE.toString(), STATIC_RADIUS);
    }

    private int getRandomNumber() {
        return new Random().nextInt(LOWER_BOUND, UPPER_BOUND);
    }
}
