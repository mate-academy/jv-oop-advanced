package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURE = 5;
    private static final double MAX_PARAMETER = 10.0;

    public Figure getRandomFigure() {
        Figure figure;
        switch (new Random().nextInt(AMOUNT_OF_FIGURE)) {
            case 0:
                return new Square(Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER);
            case 1:
                return new Rectangle(Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER);
            case 2:
                return new RightTriangle(Colors.values()[
                    new Random().nextInt(Colors.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER);
            case 3:
                return new Circle(Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER);
            case 4:
                return new IsoscelesTrapezoid(Colors.values()[
                    new Random().nextInt(Colors.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER);
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }
}
