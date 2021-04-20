package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_LIMIT = 100;

    public Figure getRandomFigure() {
        int indexOfFiguresType = (new Random().nextInt(5));
        switch (indexOfFiguresType) {
            case 1 :
                return new Triangle(new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
            case 2 :
                return new Square(new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
            case 3 :
                return new Rectangle(new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
            case 4 :
                return new IsoscelesTrapezoid(new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor());
            default :
                return new Circle(new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
        }
    }
}
