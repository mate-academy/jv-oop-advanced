package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_NUMBER = 5;
    private static final int RANDOM_PARAMETER = 25;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Shape getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int shapeKind = new Random().nextInt(RANDOM_NUMBER);
        switch (shapeKind) {
            case 0:
                return new Circle(color, getRandomNumber());
            case 1:
                return new RightTriangle(color, getRandomNumber(), getRandomNumber());
            case 2:
                return new Rectangle(color, getRandomNumber(), getRandomNumber());
            case 3:
                return new IsoscelesTrapezoid(color, getRandomNumber(), getRandomNumber(),
                        getRandomNumber());
            case 4:
            default:
                return new Square(color, getRandomNumber());
        }

    }

    private double getRandomNumber() {
        return new Random().nextInt(RANDOM_PARAMETER);
    }

}
