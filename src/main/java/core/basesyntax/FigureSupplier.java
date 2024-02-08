package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figureType = random.nextInt(5);

    public Figure getRandomFigure() {
        switch (figureType) {
            case 0:
                return new Square(getRandomSize(), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(getRandomSize(), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), colorSupplier.getRandomColor());
        }
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
