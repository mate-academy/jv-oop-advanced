package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MAX_FIGURE_NUMBER = 5;
    private static final int MAX_DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random;
    private ColorSupplier colorSupplier;

    public int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    public Figure getRandomFigure() {
        switch (MAX_FIGURE_NUMBER) {
            case 1:
                getRandomCircle();
                break;
            case 2:
                getRandomRectangle();
                break;
            case 3:
                getRandomSquare();
                break;
            case 4:
                getRandomIsoscelesTrapezoid();
                break;
            default:
                return getRandomRightTriangle();
        }
        return getRandomRightTriangle();
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
        return new Square(DEFAULT_COLOR, MAX_DEFAULT_VALUE);
    }
}
