package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        Random random = new Random();
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextDouble(1, 10));
            case 1:
                return new Rectangle(color, random.nextDouble(1, 10),
                        random.nextDouble(1, 10));
            case 2:
                return new RightTriangle(color, random.nextDouble(1, 10),
                        random.nextDouble(1, 10));
            case 3:
                return new Circle(color, random.nextDouble(1, 10));
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble(1, 10),
                        random.nextDouble(1, 10), random.nextDouble(1, 10));
            default:
                throw new IllegalStateException("Unexpected value");
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

