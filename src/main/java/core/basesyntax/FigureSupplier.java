package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOUND_MAX = 10000;
    private static final int FIGURES_QUANTITY = 5;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        final int randomRadius = random.nextInt(BOUND_MAX);
        final int randomSide = random.nextInt(BOUND_MAX);
        final int randomHeight = random.nextInt(BOUND_MAX);
        final int randomWidth = random.nextInt(BOUND_MAX);
        final int randomFirstLeg = random.nextInt(BOUND_MAX);
        final int randomSecondLeg = random.nextInt(BOUND_MAX);
        final int randPrS1 = random.nextInt(BOUND_MAX);
        final int randPrS2 = random.nextInt(BOUND_MAX);
        final int randTrH = random.nextInt(BOUND_MAX);

        Figure[] figures = new Figure[FIGURES_QUANTITY];
        int randomIndex = random.nextInt(figures.length);

        Figure randomFigure;
        randomFigure = switch (randomIndex) {
            case 0 -> figures[0] = new Circle(randomRadius);
            case 1 -> figures[1] = new Square(randomSide);
            case 2 -> figures[2] = new Rectangle(randomHeight, randomWidth);
            case 3 -> figures[3] = new RightTriangle(randomFirstLeg,randomSecondLeg);
            case 4 -> figures[4] = new IsoscelesTrapezoid(randPrS1, randPrS2, randTrH);
            default -> null;
        };
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_COLOR.toLowerCase(),DEFAULT_RADIUS);
        return defaultFigure;
    }
}
