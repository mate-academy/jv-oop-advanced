package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (RANDOM.nextInt(5)) {
            case 0:
                return new Square(color, RANDOM.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(color, RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(color, RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1);
            case 3:
                return new Circle(color, RANDOM.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color, RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1,
                        RANDOM.nextDouble() * 10 + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
