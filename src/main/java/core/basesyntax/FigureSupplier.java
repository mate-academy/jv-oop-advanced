package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_FIGURE = 5;
    private static final int MAX_VALUE_PARAMETERS = 10;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_VALUE_FIGURE)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1);
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1,
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1,
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1,
                        random.nextInt(MAX_VALUE_PARAMETERS));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1,
                        random.nextInt(MAX_VALUE_PARAMETERS) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
