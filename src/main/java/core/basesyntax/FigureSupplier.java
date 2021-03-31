package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LENGTH_MAX = 75;

    public Figure getRandomFigure() {
        int numberOfFigures = new Random().nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        switch (numberOfFigures) {
            case 1 :
                return new Triangle(random.nextInt(LENGTH_MAX),
                        colorSupplier.getRandomColor());
            case 2 :
                return new Square(random.nextInt(LENGTH_MAX),
                        colorSupplier.getRandomColor());
            case 3 :
                return new Rectangle(random.nextInt(LENGTH_MAX),
                        random.nextInt(LENGTH_MAX),
                        colorSupplier.getRandomColor());
            case 4 :
                return new IsoscelesTrapezoid(random.nextInt(LENGTH_MAX),
                        random.nextInt(LENGTH_MAX),
                        random.nextInt(LENGTH_MAX), colorSupplier.getRandomColor());
            default :
                return new Circle(random.nextInt(LENGTH_MAX),
                        colorSupplier.getRandomColor());
        }
    }
}
