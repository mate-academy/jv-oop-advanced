package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(Parameters.FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 3:
                return new Circle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            case 4:
                return new IsoscelesTrapezoid(
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1,
                        random.nextDouble() * Parameters.DEFAULT_RADIUS + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorSupplier.getRandomColor(), Parameters.DEFAULT_RADIUS);
    }
}
