package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    static final int NUMBER_OF_FIGURES = 20;
    static final int FIGURES = 5;
    static final String DEFAULT_COLOR = "WHITE";
    static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomNumber() {
        return new Random().nextInt(NUMBER_OF_FIGURES);
    }

    // this method should always return white circle with radius 10.
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figure = new Random().nextInt(FIGURES);
        switch (figure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomNumber());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber());
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomNumber());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber());
    }
}
