package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final double MAX_SIZE = 100;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (RANDOM.nextInt(5)) {
            case 0:
                return new Square(RANDOM.nextDouble() * MAX_SIZE, color);
            case 1:
                return new Rectangle(RANDOM.nextDouble() * MAX_SIZE, RANDOM.nextDouble() * MAX_SIZE, color);
            case 2:
                return new RightTriangle(RANDOM.nextDouble() * MAX_SIZE, RANDOM.nextDouble() * MAX_SIZE, color);
            case 3:
                return new Circle(RANDOM.nextDouble() * MAX_SIZE, color);
            default:
                return new IsoscelesTrapezoid(
                        RANDOM.nextDouble() * MAX_SIZE,
                        RANDOM.nextDouble() * MAX_SIZE,
                        RANDOM.nextDouble() * MAX_SIZE,
                        color
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}