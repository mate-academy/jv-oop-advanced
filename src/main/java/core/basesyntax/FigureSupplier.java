package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final int MAX_PARAMETER_VALUE = 6;
    private static final String CIRCLE_DEFAULT_COLOR = "white";
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (Figures.values()[random.nextInt(Figures.values().length)]) {
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(), getRandomNum(), getRandomNum());
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNum(), getRandomNum(), getRandomNum());
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomNum());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomNum());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNum(), getRandomNum());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_DEFAULT_COLOR, CIRCLE_DEFAULT_RADIUS);
    }

    private int getRandomNum() {
        return random.nextInt(MAX_PARAMETER_VALUE + 1);
    }
}
