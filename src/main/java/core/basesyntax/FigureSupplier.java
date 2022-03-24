package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int UNITS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int number = random.nextInt(FIGURE_COUNT);
        switch (number) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(UNITS));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(UNITS), random.nextInt(UNITS));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(UNITS), random.nextInt(UNITS));
            case 3:
                return new Circle("white", UNITS);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(UNITS), random.nextInt(UNITS), random.nextInt(UNITS));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", UNITS);
    }
}
