package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int FIGURES_PARAMETER = 10;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.White.name();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURES_PARAMETER));
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURES_PARAMETER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURES_PARAMETER), random.nextInt(FIGURES_PARAMETER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURES_PARAMETER), random.nextInt(FIGURES_PARAMETER));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURES_PARAMETER), random.nextInt(FIGURES_PARAMETER),
                        random.nextInt(FIGURES_PARAMETER));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
