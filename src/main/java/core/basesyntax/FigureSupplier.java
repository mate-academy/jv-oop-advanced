package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;

    public Figure getRandomFigure() {

        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(AllFigures.values().length);
        return switch (AllFigures.values()[index]) {
            case Circle ->
                    new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case RightTriangle ->
                    new RightTriangle(colorSupplier.getRandomColor(),
                            getRandomNumber(), getRandomNumber());
            case IsoscelesTrapezoid ->
                    new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                            getRandomNumber(), getRandomNumber());
            case Square ->
                    new Square(colorSupplier.getRandomColor(),
                            getRandomNumber());
            case Rectangle ->
                    new Rectangle(colorSupplier.getRandomColor(),
                            getRandomNumber(), getRandomNumber());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

    public int getRandomNumber() {
        return new Random().nextInt(MAX_VALUE);
    }
}
