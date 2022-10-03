package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANG = 100;
    private final int randomInd = new Random().nextInt(Shape.values().length);
    private final String randomShape = Shape.values()[randomInd].toString();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String defaultColor = "White";
    private final double defaultRadius = 10.0;

    public Figure getRandomFigure() {
        switch (randomShape) {
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_RANG));
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case "RIGHT_TRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_RANG));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
