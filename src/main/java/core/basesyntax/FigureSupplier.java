package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomFigureName = Figures.values()[RANDOM.nextInt(Figures.values().length)].name();

        switch (randomFigureName) {
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(), RANDOM.nextDouble());
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(), RANDOM.nextDouble());
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(), RANDOM.nextDouble(),
                        RANDOM.nextDouble());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(), RANDOM.nextDouble(),
                        RANDOM.nextDouble());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), RANDOM.nextDouble(),
                        RANDOM.nextDouble(), RANDOM.nextDouble());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
