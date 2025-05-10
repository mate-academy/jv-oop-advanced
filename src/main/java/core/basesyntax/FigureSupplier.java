package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES_TYPES = 5;
    private static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (random.nextInt(NUMBER_OF_FIGURES_TYPES)) {
            case 0:
                return new Circle(random.nextInt(MAX_VALUE) + 1,
                        colorSupplier.getRandomColor());
            case 1:
                return new Square(random.nextInt(MAX_VALUE) + 1,
                        colorSupplier.getRandomColor());
            case 2:
                return new Triangle(random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, colorSupplier.getRandomColor());
            default:
                return new Trapezoid(random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, colorSupplier.getRandomColor());
        }
    }
}
