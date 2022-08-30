package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int MAX_RAND_INT = 100;
    public static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomInt());
        }
    }

    public int getRandomInt() {
        return new Random().nextInt(MAX_RAND_INT);
    }

    public double getRandomDouble() {
        return new Random().nextDouble();
    }
}
