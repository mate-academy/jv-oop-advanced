package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final int MAX_SIDE_SIZE = 20;
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int randomShapeIndex = random.nextInt(FIGURES_COUNT);

        switch (Shape.values()[randomShapeIndex].toString()) {
            case "CIRCLE" :
                return new Circle(getRandomSideSize(), getRandomColor());
            case "TRIANGLE" :
                return new RightTriangle(getRandomSideSize(), getRandomSideSize(), getRandomColor());
            case "RECTANGLE":
                return new Rectangle(getRandomSideSize(), getRandomSideSize(), getRandomColor());
            case "SQUARE":
                return new Square(getRandomSideSize(), getRandomColor());
            case "TRAPEZOID":
                return new IsoscelesTrapezoid(getRandomSideSize(), getRandomSideSize(), getRandomSideSize(), getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomSideSize() {
        return new Random().nextInt(MAX_SIDE_SIZE) + 1;
    }

    private String getRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();

        return colorSupplier.getRandomColor();
    }
}
