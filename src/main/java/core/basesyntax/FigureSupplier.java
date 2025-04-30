package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = Figures.values().length;
    private static final String DEFAULT_COLOR = Colors.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(COUNT_OF_FIGURES);
        int radius = random.nextInt(100) + 1;
        int firstLeg = random.nextInt(100) + 1;
        int secondLeg = random.nextInt(100) + 1;
        int side = random.nextInt(100) + 1;
        int height = random.nextInt(100) + 1;

        switch (Figures.values()[index]) {
            case circle:
                return new Circle(colorSupplier.getRandomColor(), radius);
            case square:
                return new Square(colorSupplier.getRandomColor(), side);
            case rightTriangle:
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg,
                        secondLeg);
            case rectangle:
                return new Rectangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case isoscelesTrapezoid:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstLeg,
                        secondLeg, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
