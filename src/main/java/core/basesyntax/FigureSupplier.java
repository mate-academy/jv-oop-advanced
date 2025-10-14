package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case 0:
                return new Square(color, 1 + random.nextInt(10));
            case 1:
                return new Rectangle(color, 1 + random.nextInt(10), 1 + random.nextInt(10));
            case 2:
                return new RightTriangle(color, 1 + random.nextInt(10), 1 + random.nextInt(10));
            case 3:
                return new Circle(color, 1 + random.nextInt(10));
            case 4:
                return new IsoscelesTrapezoid(color, 1 + random.nextInt(10), 1 + random.nextInt(10), 1 + random.nextInt(10));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
