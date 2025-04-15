package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = Figures.values().length;
    private static final String DEFAULT_COLOR = Colors.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(COUNT_OF_FIGURES);
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (Figures.values()[index]) {
            case circle:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(100) + 1);
            case square:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            case rightTriangle:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            case rectangle:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            case isoscelesTrapezoid:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
