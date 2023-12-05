package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();
    private final int randomShape = random.nextInt(5);

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        return switch (randomShape) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            case 3 -> new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1,
                    random.nextInt(10) + 1, random.nextInt(10) + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
