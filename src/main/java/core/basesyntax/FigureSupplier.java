package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 100;
    private static final Random RANDOM = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    private static int random() {
        return RANDOM.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        int i = FigureSupplier.RANDOM.nextInt(5);

        switch (i) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), FigureSupplier.random());
            case 1:
                return new Square(colorSupplier.getRandomColor(), FigureSupplier.random());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        FigureSupplier.random(), FigureSupplier.random());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        FigureSupplier.random(), FigureSupplier.random());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        FigureSupplier.random(), FigureSupplier.random(), FigureSupplier.random());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
