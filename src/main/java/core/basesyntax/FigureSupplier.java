package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double CIRCLE_RADIUS = 10.0;
    public static final int FIGURE_PARAMETER = 100;
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETER));
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETER));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), CIRCLE_RADIUS);
    }
}
