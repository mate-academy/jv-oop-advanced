package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        Color color = Color.valueOf(colorSupplier.getRandomColor());
        int random = new Random().nextInt(6);

        return switch (random) {
            case 1 -> new Square(color, new Random().nextInt(10) + 1);
            case 2 -> new RightTriangle(color, new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 3 -> new Rectangle(color, new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 4 -> new IsoscelesTrapezoid(color, new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 5 -> new Circle(color, new Random().nextInt(10) + 1);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10.0);
    }
}
