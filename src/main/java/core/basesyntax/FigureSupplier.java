package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_OF_FIGURE = 5;
    private static final int MAX_SIZE = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_OF_FIGURE)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),10);
    }
}
