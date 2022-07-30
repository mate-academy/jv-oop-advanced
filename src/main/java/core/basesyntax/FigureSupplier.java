package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_LENGTH_MAX = 7;
    private static final Color finalCircleColor = Color.WHITE;
    private static final double circleRadius = 10.00;
    private static final Figure finalCircle = new Circle(finalCircleColor, circleRadius);
    private static final int NO_RANDOM_ZERO = 1;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        double randomFirstLeg = random.nextInt(FIGURE_LENGTH_MAX) + NO_RANDOM_ZERO;
        double randomSecondLeg = random.nextInt(FIGURE_LENGTH_MAX) + NO_RANDOM_ZERO;
        double randomHeight = random.nextInt(FIGURE_LENGTH_MAX) + NO_RANDOM_ZERO;
        switch (randomFigureNumber) {

            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        randomFirstLeg);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        randomFirstLeg);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomFirstLeg,randomSecondLeg);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomFirstLeg,randomSecondLeg);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomFirstLeg,randomSecondLeg,randomHeight);
            default: return finalCircle;
        }
    }

    public Figure getDefaultFigure() {
        return finalCircle;
    }
}


