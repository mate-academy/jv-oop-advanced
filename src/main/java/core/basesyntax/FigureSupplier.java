package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        double units = random.nextInt(6) + 1;
        double units2 = random.nextInt(6) + 1;
        int figure = random.nextInt(MAX_RANDOM_NUMBER);
        switch (figure) {
            case 1:
                return new Circle(color, units);
            case 2:
                return new Square(units, color);
            case 3:
                return new Rectangle(color, units, units2);
            case 4:
                return new RightTriangle(color, units, units2);
            case 0:
                return new IsoscelesTrapezoid(color, units, units2, units);
            default: return null;
        }
    }
}
