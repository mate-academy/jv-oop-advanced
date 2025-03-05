package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexFigure = random.nextInt(4);
        return switch (indexFigure) {
            case 0 -> new Circle(random.nextDouble(33),
                    colorSupplier.getRandomColor());
            case 1 -> new IsoscelesTrapezoid(random.nextDouble(33),
                    random.nextDouble(33), random.nextDouble(33),
                    colorSupplier.getRandomColor());
            case 2 -> new Rectangle(random.nextDouble(33),
                    random.nextDouble(33),
                    colorSupplier.getRandomColor());
            case 3 -> new RightTriangle(random.nextDouble(33),
                    random.nextDouble(33),
                    colorSupplier.getRandomColor());
            default -> new Square(random.nextDouble(33),
                    colorSupplier.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "whit");
    }
}
