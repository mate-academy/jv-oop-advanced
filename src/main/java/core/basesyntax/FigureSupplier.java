package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final String COLOR = new ColorSupplier().getRandomColor();
    private static final int LIMIT_NUMBER = 20;

    public Figure getRandomFigure() {
        switch (RANDOM.nextInt(4)) {
            case 0:
                return new Circle(COLOR, RANDOM.nextInt(LIMIT_NUMBER));
            case 1:
                return new Square(COLOR, RANDOM.nextInt(LIMIT_NUMBER));
            case 2:
                return new IsoscelesTrapezoid(COLOR,
                        RANDOM.nextInt(LIMIT_NUMBER),
                        RANDOM.nextInt(LIMIT_NUMBER),
                        RANDOM.nextInt(LIMIT_NUMBER));
            case 3:
                return new Rectangle(COLOR,
                        RANDOM.nextInt(LIMIT_NUMBER),
                        RANDOM.nextInt(LIMIT_NUMBER));
            case 4:
                return new RightTriangle(COLOR,
                        RANDOM.nextInt(LIMIT_NUMBER),
                        RANDOM.nextInt(LIMIT_NUMBER));
            default:
                return new Circle("white", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
