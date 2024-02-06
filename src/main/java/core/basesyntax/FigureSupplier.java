package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_FIGURE_PARAMETER_NUMBER = 20;
    private static final int RADIUS_OF_DEFAULT_FIGURE = 10;
    private static final String COLOR_OF_DEFAULT_FIGURE = Color.WHITE.getTitle();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (getRandomNumberOfFigure()) {
            case 0:
                return getRandomRectangle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomSquare();
            default:
                return getRandomCircle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_DEFAULT_FIGURE, RADIUS_OF_DEFAULT_FIGURE);
    }

    private int getRandomParameter() {
        return random.nextInt(MAX_FIGURE_PARAMETER_NUMBER);
    }

    private int getRandomNumberOfFigure() {
        return random.nextInt(NUMBER_OF_FIGURES);
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomParameter(), getRandomParameter());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomParameter(), getRandomParameter(), getRandomParameter());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomParameter(), getRandomParameter());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomParameter());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomParameter());
    }
}
