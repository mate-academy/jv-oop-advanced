package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Figure getRandomFigure(String randomColor) {
        switch (RANDOM.nextInt(5)) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            case 3:
                return new Circle(ColorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * 10 + 1);
            default:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
