package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private String[] figureTypes = {"Circle", "IsoscelesTrapezoid", "Rectangle",
            "RightTriangle", "Square"};
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final double DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        switch (figureTypes[random.nextInt(figureTypes.length)]) {
            case "Circle":
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case "Rectangle":
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            case "RightTriangle":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            case "Square":
                return new Square(colorSupplier.getRandomColor(), random.nextDouble());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
