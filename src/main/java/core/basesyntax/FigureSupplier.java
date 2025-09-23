package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final FigureName[] figures = FigureName.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);
        String nameOfFigure = figures[index].name();
        String randomColor = colorSupplier.getRandomColor();

        switch (nameOfFigure) {
            case "Circle":
                return new Circle(randomColor, random.nextDouble());
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(randomColor,
                        random.nextDouble(), random.nextDouble(), random.nextDouble());
            case "Rectangle":
                return new Rectangle(randomColor, random.nextDouble(), random.nextDouble());
            case "RightTriangle":
                return new RightTriangle(randomColor, random.nextDouble(), random.nextDouble());
            case "Square":
                return new Square(randomColor, random.nextDouble());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
