package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int index = random.nextInt(5);
        final String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new Circle(random.nextInt(100), color);
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), color);
            case 2:
                return new Rectangle(random.nextInt(100), random.nextInt(100), color);
            case 3:
                return new RightTriangle(random.nextInt(100), color);
            default:
                return new Square(random.nextInt(100), color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white.toString());
    }
}
