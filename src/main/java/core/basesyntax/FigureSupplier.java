package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomInt() {
        return new Random().nextInt(5);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);

        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble(), getRandomDouble());
            case 4:
            default:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble());
        }
    }
}
