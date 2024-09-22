package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextDouble() * MAX_VALUE);
            case 1:
                return new Rectangle(color, random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE);
            case 2:
                return new RightTriangle(color, random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE);
            case 3:
                return new Circle(color, random.nextDouble() * MAX_VALUE);
            default:
                return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE, random.nextDouble() * MAX_VALUE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
