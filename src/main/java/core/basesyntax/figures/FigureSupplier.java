package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomProperties() {
        int randomFigure = 20;
        return new Random().nextInt(randomFigure);
    }

    // this method should always return white circle with radius 10.
    public Calculator getDefaultFigure() {
        String colorDefaultFigure = "WHITE";
        int radiusDefaultFigure = 10;
        return new Circle(colorDefaultFigure, radiusDefaultFigure);
    }

    public Calculator getRandomFigure() {
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
                getRandomProperties());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomProperties(),
                getRandomProperties());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomProperties(),
                getRandomProperties());
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomProperties());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomProperties(),
                getRandomProperties(),
                getRandomProperties());
    }
}
