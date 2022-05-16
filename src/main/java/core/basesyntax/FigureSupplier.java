package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(getRandomInt(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(getRandomInt(),
                                    getRandomInt(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomInt(),
                                        getRandomInt(), colorSupplier.getRandomColor());
            case 4:
            default:
                return new Square(getRandomInt(), colorSupplier.getRandomColor());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
