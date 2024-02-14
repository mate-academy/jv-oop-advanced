package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_UNITS = 11;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomShape = getRandomShape();
        String randomColor = colorSupplier.getRandomColor();
        int randomUnits = random.nextInt(1, MAX_RANDOM_UNITS);

        switch (randomShape) {
            case "SQUARE":
                return new Square(randomShape, randomColor, randomUnits);
            case "RECTANGLE":
                return new Rectangle(randomShape, randomColor, randomUnits, randomUnits);
            case "RIGHT_TRIANGLE":
                return new RightTriangle(randomShape, randomColor, randomUnits, randomUnits);
            case "CIRCLE":
                return new Circle(randomShape, randomColor, randomUnits);
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(
                        randomShape, randomColor, randomUnits, randomUnits, randomUnits);
            default:
                throw new IllegalArgumentException("Unexpected value: " + randomShape);
        }
    }

    public Figure getDefaultFigure() {
        String defaultShape = Shapes.SQUARE.name();
        String defaultColor = Colors.BLUE.name();

        return new Square(defaultShape, defaultColor, MAX_RANDOM_UNITS);
    }

    private String getRandomShape() {
        int randomIndex = random.nextInt(Shapes.values().length);
        return Shapes.values()[randomIndex].name();
    }
}
