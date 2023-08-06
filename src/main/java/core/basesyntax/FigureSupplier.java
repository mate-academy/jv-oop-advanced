package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), 10);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble(),
                        getRandomDouble());
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double getRandomDouble() {
        return 1.0 + random.nextDouble() * 10.0;
    }
}
