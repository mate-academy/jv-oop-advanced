package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomNumber() {
        int randomFigure = 20;
        return new Random().nextInt(randomFigure);
    }

    // this method should always return white circle with radius 10.
    public Figure getDefaultFigure() {
        String colorDefaultFigure = "WHITE";
        int radiusDefaultFigure = 10;
        return new Circle(colorDefaultFigure, radiusDefaultFigure);
    }

    public Figure getRandomFigure() {
        int numberOfFigures = 5;
        int figure = new Random().nextInt(numberOfFigures);
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
