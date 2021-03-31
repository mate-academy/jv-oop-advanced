package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RAND_NUMBER = 50;

    public Figure randomFigure() {
        int randomNumber = new Random().nextInt(5);
        switch (randomNumber) {
            case 1:
                return new Square(ColorSuplier.randomColor(), new Random().nextInt(RAND_NUMBER));
            case 2:
                return new Rectangle(ColorSuplier.randomColor(), new Random().nextInt(RAND_NUMBER),
                        new Random().nextInt(RAND_NUMBER));
            case 3:
                return new RightTriangle(ColorSuplier.randomColor(),
                        new Random().nextInt(RAND_NUMBER));
            case 4:
                return new IsoscelesTrapezoi(ColorSuplier.randomColor(),
                        new Random().nextInt(RAND_NUMBER),
                        new Random().nextInt(RAND_NUMBER));
            default:
                return new Circle(ColorSuplier.randomColor(), new Random().nextInt(RAND_NUMBER));
        }
    }
}
