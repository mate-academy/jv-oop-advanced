package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int BOUND_MAX = 10000;
    private Random random = new Random();
    private int randomRadius = random.nextInt(BOUND_MAX);
    private int randomSide = random.nextInt(BOUND_MAX);
    private int randomHeight = random.nextInt(BOUND_MAX);
    private int randomWidth = random.nextInt(BOUND_MAX);
    private int randomFirstLeg = random.nextInt(BOUND_MAX);
    private int randomSecondLeg = random.nextInt(BOUND_MAX);
    private int randPrS1 = random.nextInt(BOUND_MAX);
    private int randPrS2 = random.nextInt(BOUND_MAX);
    private int randTrH = random.nextInt(BOUND_MAX);
    private Figure circle = new Circle(randomRadius);
    private Figure square = new Square(randomSide);
    private Figure rectangle = new Rectangle(randomHeight, randomWidth);
    private Figure rightTriangle = new RightTriangle(randomFirstLeg,randomSecondLeg);
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randPrS1, randPrS2, randTrH);
    private Figure[] figures = {circle, square, rectangle, rightTriangle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(figures.length);
        return figures [randomIndex];
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10);
        defaultFigure.setColor(DEFAULT_COLOR.toLowerCase());
        return defaultFigure;
    }

}
