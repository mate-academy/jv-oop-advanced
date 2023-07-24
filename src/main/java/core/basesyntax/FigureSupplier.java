package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(Parameters.FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 4:
                return new IsoscelesTrapezoid(
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, Parameters.DEFAULT_RADIUS);
    }
}
