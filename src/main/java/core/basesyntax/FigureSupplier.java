package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_LENGTH = 20;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0 :
                return new Circle("circle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH));
            case 1:
                return new IsoscelesTrapezoid("trapezoid", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH));
            case 2:
                return new Rectangle("rectangle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 3:
                return new RightTriangle("triangle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 4:
                return new Square("square",colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", Color.white.name(), DEFAULT_RADIUS);
    }
}
