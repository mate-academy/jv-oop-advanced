package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MAX_FIGURE_NUMBER = 5;
    private static final int MAX_DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = "white";
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    public Figure getRandomFigure() {
        int getRandomFigure = random.nextInt(MAX_FIGURE_NUMBER);
        switch (getRandomFigure) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber(), getRandomNumber());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(), getRandomNumber());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_DEFAULT_VALUE);
    }
}
