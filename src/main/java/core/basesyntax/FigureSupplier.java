package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;
    private static final int NUMBER_TYPES_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_TYPES_OF_FIGURES)) {
            case 0: return new Circle(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE));
            case 1: return new RightTriangle(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 2: return new Rectangle(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 3: return new Square(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE));
            case 4: return new IsoscelesTrapezoid(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE));
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
