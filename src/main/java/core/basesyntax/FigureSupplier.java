package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {

        Random random = new Random();
        int figureType = random.nextInt(5);

        return switch (figureType) {
            case 0 -> new Square(random.nextDouble(100), ColorSupplier.getRandomColor());
            case 1 -> new Circle(random.nextDouble(100), ColorSupplier.getRandomColor());
            case 2 -> new Rectangle(random.nextDouble(100), random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 3 -> new RightTriangle(random.nextDouble(100), random.nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextDouble(100), random.nextDouble(100),
                    random.nextDouble(100), ColorSupplier.getRandomColor());
            default -> new Circle(10, "WHITE");
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle(10,"WHITE");
    }
}
