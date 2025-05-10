package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH = 30;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
