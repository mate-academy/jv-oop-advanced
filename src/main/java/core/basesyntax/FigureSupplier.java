package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_SIDE = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                            random.nextInt(DEFAULT_SIDE));
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                          random.nextInt(DEFAULT_SIDE),
                        random.nextInt(DEFAULT_SIDE));
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(DEFAULT_SIDE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                               random.nextInt(DEFAULT_SIDE),
                                    random.nextInt(DEFAULT_SIDE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                          random.nextInt(DEFAULT_SIDE),
                        random.nextInt(DEFAULT_SIDE), random.nextInt(DEFAULT_SIDE));
        }
    }
}
