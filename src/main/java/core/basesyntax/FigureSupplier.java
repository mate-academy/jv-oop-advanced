package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        new Random();
        int figureIndex = new Random().nextInt();
        final ColorSupplier colorSupplier = new ColorSupplier();
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

    private int getRandomInt() {
        return new Random().nextInt(5);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

    public void getDefaultFigure() {
        int figures = new Random().nextInt(1);
    }
}
