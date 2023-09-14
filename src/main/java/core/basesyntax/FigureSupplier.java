package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int randomType = RANDOM.nextInt(5);
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randomType) {
            case 0:
                return new Square(RANDOM.nextDouble() * 10, randomColor);
            case 1:
                return new Rectangle(RANDOM.nextDouble() * 10,
                        RANDOM.nextDouble() * 10, randomColor);
            case 2:
                return new RightTriangle(RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1, randomColor);
            case 3:
                return new Circle(RANDOM.nextDouble() * 10, randomColor);
            default:;
                return new IsoscelesTrapezoid(
                        RANDOM.nextDouble() * 10, RANDOM.nextDouble() * 10,
                        RANDOM.nextDouble() * 10, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
