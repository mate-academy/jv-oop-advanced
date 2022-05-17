package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random ();
    private static final int MAX_FIGURES = 4;
    private static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(MAX_FIGURES);
        switch (figureIndex) {
            case 0:
                return new Circle(getRandomInt(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(getRandomInt(),
                                    getRandomInt(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomInt(),
                                        getRandomInt(), colorSupplier.getRandomColor());
            case 4:
            default:
                return new Square(getRandomInt(), colorSupplier.getRandomColor());
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_VALUE);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}
