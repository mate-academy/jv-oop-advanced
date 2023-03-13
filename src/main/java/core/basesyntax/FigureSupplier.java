package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int BOUND = 54;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = new Random().nextInt(FIGURES_COUNT);
        switch (numberOfFigures) {
            case 1 :
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            case 2 :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            case 3 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                    random.nextInt(BOUND), random.nextInt(BOUND));
            case 4 :
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                    random.nextInt(BOUND));
            case 5 :
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                    random.nextInt(BOUND));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
