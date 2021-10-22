package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String[] figureTypes = new String[]{"RECTANGLE", "RIGHT TRIANGLE",
            "CIRCLE", "SQUARE", "ISOSCELES TRAPEZOID"};

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureIndex = random.nextInt(figureTypes.length);

        switch (figureTypes[figureIndex]) {
            case "RECTANGLE": {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 100, random.nextDouble() * 100);
            }
            case "RIGHT TRIANGLE": {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 100, random.nextDouble() * 100);
            }
            case "CIRCLE": {
                return new Circle(colorSupplier.getRandomColor(),random.nextDouble() * 100);
            }
            case "SQUARE": {
                return new Square(colorSupplier.getRandomColor(),random.nextDouble() * 100);
            }
            case "ISOSCELES TRAPEZOID": {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * 100, random.nextDouble() * 100,
                        random.nextDouble() * 100);
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
