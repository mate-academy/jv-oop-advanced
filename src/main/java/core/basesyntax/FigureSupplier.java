package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 30;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
