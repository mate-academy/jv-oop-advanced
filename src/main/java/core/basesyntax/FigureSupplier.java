package core.basesyntax;

import java.util.Random;

public class FigureSupplier  {
    private final Random PICKER = new Random();
    private final int RANDOM_NUMBER = 4;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (PICKER.nextInt(RANDOM_NUMBER)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    PICKER.nextInt(1, 50));
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    PICKER.nextInt(1, 50),
                    PICKER.nextInt(1, 50));
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    PICKER.nextInt(1, 50),
                    PICKER.nextInt(1, 50));
            case 3 -> new Square(colorSupplier.getRandomColor(),
                    PICKER.nextInt(1, 50));
            default -> new Circle(Colors.WHITE, 10);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }
}
