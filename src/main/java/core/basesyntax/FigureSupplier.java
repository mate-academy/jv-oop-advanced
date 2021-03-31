package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int LENGTH_MAX = 75;

    public Figure getRandomFigure() {
        int allFigures = (new Random().nextInt(5));
        switch (allFigures) {
            case 1 :
                return new Triangle(new Random().nextInt(LENGTH_MAX),
                        ColorSupplier.getRandomColor());
            case 2 :
                return new Square(new Random().nextInt(LENGTH_MAX),
                        ColorSupplier.getRandomColor());
            case 3 :
                return new Rectangle(new Random().nextInt(LENGTH_MAX),
                        new Random().nextInt(LENGTH_MAX),
                        ColorSupplier.getRandomColor());
            case 4 :
                return new IsoscelesTrapezoid(new Random().nextInt(LENGTH_MAX),
                        new Random().nextInt(LENGTH_MAX),
                        new Random().nextInt(LENGTH_MAX), ColorSupplier.getRandomColor());
            default :
                return new Circle(new Random().nextInt(LENGTH_MAX),
                        ColorSupplier.getRandomColor());
        }
    }
}
