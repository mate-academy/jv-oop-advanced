package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    private final Random picker = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int figureCount = 5;
        final int startNum = 1;
        final int limitNum = 50;

        return switch (picker.nextInt(figureCount)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    picker.nextInt(startNum, limitNum));
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    picker.nextInt(startNum, limitNum),
                    picker.nextInt(startNum, limitNum));
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    picker.nextInt(startNum, limitNum),
                    picker.nextInt(startNum, limitNum));
            case 3 -> new Square(colorSupplier.getRandomColor(),
                    picker.nextInt(startNum, limitNum));
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    picker.nextInt(startNum, limitNum),
                    picker.nextInt(startNum, limitNum),
                    picker.nextInt(startNum, limitNum));
            default -> new Circle(Color.WHITE, 10);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
