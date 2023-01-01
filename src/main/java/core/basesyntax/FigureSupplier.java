package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 5;
    private static final int PARAM_BOUND = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(BOUND)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(PARAM_BOUND));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(PARAM_BOUND));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAM_BOUND),
                        random.nextInt(PARAM_BOUND));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(PARAM_BOUND),
                        random.nextInt(PARAM_BOUND),
                        random.nextInt(PARAM_BOUND));
            default:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAM_BOUND),
                        random.nextInt(PARAM_BOUND));

        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
