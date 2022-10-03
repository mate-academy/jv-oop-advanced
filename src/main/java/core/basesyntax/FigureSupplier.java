package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANG = 100;
    private final int randomInd = new Random().nextInt(Shape.values().length);
    private final String randomShape = Shape.values()[randomInd].toString();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String color = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        switch (randomShape) {
            case "CIRCLE":
                return new Circle(color, new Random().nextInt(MAX_RANG));
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(color, new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG), new Random().nextInt(MAX_RANG));
            case "RECTANGLE":
                return new Rectangle(color, new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case "RIGHT_TRIANGLE":
                return new RightTriangle(color, new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case "SQUARE":
                return new Square(color, new Random().nextInt(MAX_RANG));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle();
    }
}
