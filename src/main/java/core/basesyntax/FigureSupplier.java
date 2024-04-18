package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Figure getRandomFigure() {
        switch (RANDOM.nextInt(5)) {
            case 0:
                return new Square(RANDOM.nextInt(10) + 1, ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(RANDOM.nextInt(10) + 1,
                        RANDOM.nextInt(10) + 1, ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(RANDOM.nextInt(10) + 1,
                        RANDOM.nextInt(10) + 1, ColorSupplier.getRandomColor());
            case 3:
                return new Circle(RANDOM.nextInt(10) + 1, ColorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(RANDOM.nextInt(10) + 1,
                        RANDOM.nextInt(10) + 1,
                        RANDOM.nextInt(10) + 1, ColorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
