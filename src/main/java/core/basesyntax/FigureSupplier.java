package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(getRandomSize(), color);
            case 1:
                return new Rectangle(getRandomSize(), getRandomSize(), color);
            case 2:
                return new RightTriangle(getRandomSize(),getRandomSize(), color);
            case 3:
                return new Circle(getRandomSize(), color);
            case 4:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), color);
            default:
                throw new RuntimeException("Unknown figure type: " + type);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }

}
