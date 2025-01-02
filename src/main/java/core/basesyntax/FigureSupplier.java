package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random picker = new Random();
    private final int randomNum = 4;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (picker.nextInt(randomNum)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    picker.nextInt(1, 50));
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    picker.nextInt(1, 50),
                    picker.nextInt(1, 50));
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    picker.nextInt(1, 50),
                    picker.nextInt(1, 50));
            case 3 -> new Square(colorSupplier.getRandomColor(),
                    picker.nextInt(1, 50));
            default -> new Circle(Colors.WHITE, 10);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }
}
