package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CONST_NUMBER = 10;
    private static final int RANDOM_NUMBER_FIGURE = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(RANDOM_NUMBER_FIGURE)) {
            case (0):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(CONST_NUMBER), random.nextInt(CONST_NUMBER),
                        random.nextInt(CONST_NUMBER));
            case (1):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(CONST_NUMBER));
            case (2):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(CONST_NUMBER), random.nextInt(CONST_NUMBER));
            case (3):
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(CONST_NUMBER),
                        random.nextInt(CONST_NUMBER));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(CONST_NUMBER));
        }
    }
}
