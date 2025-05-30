package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int random = new Random().nextInt(6);

        return switch (random) {
            case 1 -> new Square(colorSupplier.getRandomColor(),
                    new Random().nextInt(10) + 1);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 3 -> new Rectangle(colorSupplier.getRandomColor(),
                    new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 5 -> new Circle(colorSupplier.getRandomColor(),
                    new Random().nextInt(10) + 1);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10.0);
    }
}
