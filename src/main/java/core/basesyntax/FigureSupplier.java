package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final double defaultRadius = 10;
    private final String defaultColor = "White";

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(10));
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(10));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10),
                        random.nextInt(10));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
