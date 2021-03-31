package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RAND_NUMBER = 50;
    private static final int RAND_FIGURE = 5;
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure randomFigure() {
        int randomNumber = new Random().nextInt(RAND_FIGURE);
        switch (randomNumber) {
            case 1:
                return new Square(colorSupplier.randomColor(), new Random().nextInt(RAND_NUMBER));
            case 2:
                return new Rectangle(colorSupplier.randomColor(), new Random().nextInt(RAND_NUMBER),
                        new Random().nextInt(RAND_NUMBER));
            case 3:
                return new RightTriangle(colorSupplier.randomColor(),
                        new Random().nextInt(RAND_NUMBER));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.randomColor(),
                        new Random().nextInt(RAND_NUMBER),
                        new Random().nextInt(RAND_NUMBER));
            default:
                return new Circle(colorSupplier.randomColor(), new Random().nextInt(RAND_NUMBER));
        }
    }
}
