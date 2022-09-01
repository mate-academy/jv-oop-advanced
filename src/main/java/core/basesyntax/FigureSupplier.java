package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberFigure = new Random().nextInt(4);
        switch (numberFigure) {
            case 0:
                return new Circle(getRandomDouble(), colorSupplier.getRandomColor());
            case 1:
                return new Square(getRandomDouble(), colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(getRandomDouble(), getRandomDouble(),
                        colorSupplier.getRandomColor());
            default:
                return new RightTriangle(getRandomDouble(), getRandomDouble(),
                        colorSupplier.getRandomColor());
        }
    }

    private static double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
