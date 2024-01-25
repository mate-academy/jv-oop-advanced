package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomFigureName = FigureType.values()
                [random.nextInt(FigureType.values().length)].name();

        switch (randomFigureName) {
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(), random.nextDouble());
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
