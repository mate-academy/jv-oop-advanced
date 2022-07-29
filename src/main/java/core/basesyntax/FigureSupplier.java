package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURE = 5;
    private static final double MAX_PARAMETER = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        switch (new Random().nextInt(AMOUNT_OF_FIGURE)) {
            case 0:
                return new Square(Color.values()[new Random().nextInt(Color.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER);
            case 1:
                return new Rectangle(Color.values()[new Random().nextInt(Color.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER);
            case 2:
                return new RightTriangle(Color.values()[
                    new Random().nextInt(Color.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER);
            case 3:
                return new Circle(Color.values()[new Random().nextInt(Color.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER);
            case 4:
                return new IsoscelesTrapezoid(Color.values()[
                    new Random().nextInt(Color.values().length)],
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER,
                    new Random().nextDouble() * MAX_PARAMETER);
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
