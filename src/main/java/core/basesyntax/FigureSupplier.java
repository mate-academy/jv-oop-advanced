package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int BOARD_FOR_VALUES_OF_FIGURES = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRectangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }

    private int getRandomValue() {
        return random.nextInt(BOARD_FOR_VALUES_OF_FIGURES);
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(getRandomValue(),
                getRandomValue(),
                colorSupplier.getRandomColor());
    }

    private Circle getRandomCircle() {
        return new Circle(getRandomValue(),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(getRandomValue(), getRandomValue(),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomValue(),
                getRandomValue(), getRandomValue(), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(getRandomValue(), colorSupplier.getRandomColor());
    }

}
