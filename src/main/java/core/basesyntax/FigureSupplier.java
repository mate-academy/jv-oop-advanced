package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;
    public static final int BOUND_MAX = 10000;

    private final Random random = new Random();
    private final int randomRadius = random.nextInt(BOUND_MAX);
    private final int randomSide = random.nextInt(BOUND_MAX);
    private final int randomHeight = random.nextInt(BOUND_MAX);
    private final int randomWidth = random.nextInt(BOUND_MAX);
    private final int randomFirstLeg = random.nextInt(BOUND_MAX);
    private final int randomSecondLeg = random.nextInt(BOUND_MAX);
    private final int randPrS1 = random.nextInt(BOUND_MAX);
    private final int randPrS2 = random.nextInt(BOUND_MAX);
    private final int randTrH = random.nextInt(BOUND_MAX);
    private final Figure circle = new Circle(randomRadius);
    private final Figure square = new Square(randomSide);
    private final Figure rectangle = new Rectangle(randomHeight, randomWidth);
    private final Figure rightTriangle = new RightTriangle(randomFirstLeg,randomSecondLeg);
    private final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randPrS1, randPrS2, randTrH);

    public Figure getRandomFigure() {

        Figure[] figures = {circle, square, rectangle, rightTriangle, isoscelesTrapezoid};
        int randomIndex = random.nextInt(figures.length);

        Figure randomFigure;
        randomFigure = switch (randomIndex) {
            case 0 -> figures[0];
            case 1 -> figures[1];
            case 2 -> figures[2];
            case 3 -> figures[3];
            case 4 -> figures[4];
            default -> null;
        };
        return randomFigure;

    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS);
        defaultFigure.setColor(DEFAULT_COLOR.toLowerCase());
        return defaultFigure;
    }

}
