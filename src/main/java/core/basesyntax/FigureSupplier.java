package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_FIGURE_RADIUS = 10.0;
    private static final double MAX_VALUE = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(this.FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(color, this.random.nextDouble() * MAX_VALUE);
            case 1:
                return new Rectangle(color, this.random.nextDouble() * MAX_VALUE,
                        this.random.nextDouble() * MAX_VALUE);
            case 2:
                return new RightTriangle(color, this.random.nextDouble() * MAX_VALUE,
                        this.random.nextDouble() * MAX_VALUE);
            case 3:
                return new Circle(color, this.random.nextDouble() * MAX_VALUE);
            default:
                return new IsoscelesTrapezoid(
                        color, this.random.nextDouble() * MAX_VALUE,
                        this.random.nextDouble() * MAX_VALUE,
                        this.random.nextDouble() * MAX_VALUE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, this.DEFAULT_FIGURE_RADIUS);
    }
}
