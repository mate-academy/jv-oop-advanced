package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureCount = 5;
        int rnd = random.nextInt(figureCount);
        int valueCount = 100;
        switch (rnd) {
            case 0:
                return new Circle(random.nextInt(valueCount), color.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(valueCount),
                        random.nextInt(valueCount),
                        random.nextInt(valueCount),
                        color.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(valueCount),
                        random.nextInt(valueCount),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(valueCount),
                        random.nextInt(valueCount),
                        color.getRandomColor());
            case 4:
                return new Square(random.nextInt(valueCount), color.getRandomColor());
            default:
                getDefaultFigure();
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        final int defaultValue = 10;
        return new Circle(defaultValue, Color.WHITE.name());
    }
}
