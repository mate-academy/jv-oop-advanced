package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final double MAX_PARAMETER = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(AMOUNT_OF_FIGURES);
        Color randomColor = Color.values()[new Random().nextInt(Color.values().length)];
        switch (randomIndex) {
            case 0:
                return new Square(randomColor,
                        new Random().nextDouble() * MAX_PARAMETER);
            case 1:
                return new Rectangle(randomColor,
                        new Random().nextDouble() * MAX_PARAMETER,
                        new Random().nextDouble() * MAX_PARAMETER);
            case 2:
                return new RightTriangle(randomColor,
                        new Random().nextDouble() * MAX_PARAMETER,
                        new Random().nextDouble() * MAX_PARAMETER);
            case 3:
                return new Circle(randomColor,
                        new Random().nextDouble() * MAX_PARAMETER);
            case 4:
                return new IsoscelesTrapezoid(randomColor,
                        new Random().nextDouble() * MAX_PARAMETER,
                        new Random().nextDouble() * MAX_PARAMETER,
                        new Random().nextDouble() * MAX_PARAMETER);
            default:
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
