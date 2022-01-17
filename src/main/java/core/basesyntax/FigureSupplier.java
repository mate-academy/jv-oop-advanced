package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int COUNT = 4;
    public static final int MAX_SIZE = 100;
    public static final int MAX_SIZE_DEFAULT = 10;

    public Figure getDefaultFigure() {
        return new Circle("WHITE", MAX_SIZE_DEFAULT);
    }

    public Figure getRandomFigure() {
        switch (new Random().nextInt(COUNT)) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE));
            case 1:
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE));
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            default:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
        }
    }
}
