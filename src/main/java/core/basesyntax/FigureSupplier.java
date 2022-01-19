package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 6;
    private static final int RANDOM_PARAMETER_LIMIT = 17;

    public Figure getRandomFigure() {
        int number = new Random().nextInt(FIGURE_NUMBER);

        switch (number) {
            case 1:
                return new Circle(new ColorSupplier().getRandomColor(),
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1);
            case 2:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1,
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1,
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1);
            case 3:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1,
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1);
            case 4:
                return new Square(new ColorSupplier().getRandomColor(),
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1);
            case 5:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1,
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1);
            default:
                return new Circle(new ColorSupplier().getRandomColor(),
                        Math.random() * RANDOM_PARAMETER_LIMIT + 1);
        }

    }
}
