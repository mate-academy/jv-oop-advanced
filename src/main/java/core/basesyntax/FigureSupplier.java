package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANG = 100;
    private static final String DEFAULT_COLOR = "White";
    private static final double DEFAULT_RADIUS = 10.0;
    private final int randomInd = new Random().nextInt(Shape.values().length);
    private final String randomShape = Shape.values()[randomInd].toString();
    private final ColorSupplier colorSupplier = new ColorSupplier();

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
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
