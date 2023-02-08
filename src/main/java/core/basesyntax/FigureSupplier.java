package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        if (FigureType.values()[random.nextInt(FigureType.values().length)].name()
                .equals(FigureType.CIRCLE.name())) {
            return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX));
        }
        if (FigureType.values()[random.nextInt(FigureType.values().length)].name()
                .equals(FigureType.SQUARE.name())) {
            return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX));
        }
        if (FigureType.values()[random.nextInt(FigureType.values().length)].name()
                .equals(FigureType.RECTANGLE.name())) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX), random.nextInt(MAX));
        }
        if (FigureType.values()[random.nextInt(FigureType.values().length)].name()
                .equals(FigureType.RIGHT_TRIANGLE.name())) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX), random.nextInt(MAX));
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX), random.nextInt(MAX), random.nextInt(MAX));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}

