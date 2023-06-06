package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final Shape[] shapes = Shape.values();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(shapes.length);
        String figureName = shapes[randomNumber].name();

        switch (figureName) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            case "RIGHT_TRIANGLE":
                return new RightTriangle();
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
