package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final double MAX_PARAMETER = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomIndex = random.nextInt(AMOUNT_OF_FIGURES);
        Color randomColor = Color.values()[random.nextInt(Color.values().length)];
        double randomSize = random.nextDouble() * MAX_PARAMETER;
        switch (randomIndex) {
            case 0:
                return new Square(randomColor,random.nextDouble() * MAX_PARAMETER);
            case 1:
                return new Rectangle(randomColor,
                        random.nextDouble() * MAX_PARAMETER,
                        random.nextDouble() * MAX_PARAMETER);
            case 2:
                return new RightTriangle(randomColor,
                        random.nextDouble() * MAX_PARAMETER,
                        random.nextDouble() * MAX_PARAMETER);
            case 3:
                return new Circle(randomColor,
                        random.nextDouble() * MAX_PARAMETER);
            case 4:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextDouble() * MAX_PARAMETER,
                        random.nextDouble() * MAX_PARAMETER,
                        random.nextDouble() * MAX_PARAMETER);
            default:
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
