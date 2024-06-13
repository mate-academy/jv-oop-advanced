package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_VALUE = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        String figureName = FigureType.values()[index].name();

        String randomColor = colorSupplier.getRandomColor();
        switch (figureName) {
            case "CIRCLE":
                return new Circle(randomColor, randomSize());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(randomColor,
                        randomSize(), randomSize(), randomSize());
            case "RECTANGLE":
                return new Rectangle(randomColor, randomSize(), randomSize());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(randomColor, randomSize());
            case "SQUARE":
                return new Square(randomColor, randomSize());
            default:
                return new Square(randomColor, randomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private double randomSize() {
        return random.nextInt() * MAXIMUM_VALUE;
    }
}
