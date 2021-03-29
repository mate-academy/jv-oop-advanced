package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int RANDOM_LIMIT = 100;

    public Figure getRandomFigure() {
        int indexOfFiguresType = (new Random().nextInt(5));
        Figure result;
        switch (indexOfFiguresType) {
            case 1 :
                result = new Triangle(new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
                break;
            case 2 :
                result = new Square(new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
                break;
            case 3 :
                result = new Rectangle(new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
                break;
            case 4 :
                result = new IsoscelesTrapezoid(new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor());
                break;
            default :
                result = new Circle(new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor());
                break;
        }
        return result;
    }
}
