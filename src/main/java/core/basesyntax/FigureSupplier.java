package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_FIGURE_RADIUS = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = this.random.nextInt(this.FIGURE_COUNT);
        Color color = this.colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(color, this.random.nextDouble());
            case 1:
                return new Rectangle(color, this.random.nextDouble(), this.random.nextDouble());
            case 2:
                return new RightTriangle(color, this.random.nextDouble(), this.random.nextDouble());
            case 3:
                return new Circle(color, this.random.nextDouble());
            default:
                return new IsoscelesTrapezoid(
                        color, this.random.nextDouble(),
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, this.DEFAULT_FIGURE_RADIUS);
    }
}
