package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(random.nextInt(100), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100), random.nextInt(100), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(100), random.nextInt(100), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(100), colorSupplier.getRandomColor());
            case 4:
                return new Square(random.nextInt(100), colorSupplier.getRandomColor());
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white.toString());
    }
}
