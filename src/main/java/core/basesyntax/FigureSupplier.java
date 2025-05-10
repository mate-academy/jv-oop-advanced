package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int UNITS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int number = random.nextInt(FIGURE_COUNT);
        int randomInt = random.nextInt(UNITS);
        switch (number) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), randomInt);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(UNITS), randomInt);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), randomInt, randomInt);
            case 3:
                return new Circle(Color.WHITE.name(), UNITS);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomInt, randomInt, randomInt);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), UNITS);
    }
}
