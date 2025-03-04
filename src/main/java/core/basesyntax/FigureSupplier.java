package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(), random.nextInt(10),
                           random.nextInt(10));
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(), random.nextInt(10),
                           random.nextInt(10));
            case 3:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(10));
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), random.nextInt(10),
                           random.nextInt(10), random.nextInt(10));
            default:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(10));
        }
    }

    public static Figure getDefaultFigure() {
        return switch (new Random().nextInt(5)) {
            case 1 -> new Rectangle(Color.WHITE, 5, 5);
            case 2 -> new RightTriangle(Color.WHITE, 5, 10);
            case 3 -> new Circle(Color.WHITE, 5);
            case 4 -> new IsoscelesTrapezoid(Color.WHITE, 5, 10, 8);
            default -> new Square(Color.WHITE, 5);
        };
    }
}
