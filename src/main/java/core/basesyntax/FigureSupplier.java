package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        return switch (index) {
            case 0 -> new Circle();
            case 1 -> new IsoscelesTrapezoid();
            case 2 -> new Rectangle();
            case 3 -> new RightTriangle();
            case 4 -> new Square();
            default -> throw new IllegalStateException(
                    "Unexpected value: " + index);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
