package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(random.nextDouble() * MAX_VALUE, color);
            case 1:
                return new Square(random.nextDouble() * MAX_VALUE, color);
            case 2:
                return new Rectangle(random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE, color);
            case 3:
                return new RightTriangle(random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE, color);
            default:
                return new IsoscelesTrapezoid(random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE,
                        random.nextDouble() * MAX_VALUE, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
