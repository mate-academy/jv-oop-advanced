package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURE = 5;
    private static final int MAX_VALUE_FOR_CALCULATIONS = 10;
    private static final int DEFAULT_RADIUS_FOR_CIRCLE = 10;
    private static final int SETTING_FOR_GENERATING_DOUBLE_NUMBER = 3;
    private static final int SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE = 1;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomNumberFigure()) {
            case 1:
                return getCircle();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getRectangle();
            case 4:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }

    private int getRandomNumberFigure() {
        return random.nextInt(COUNT_OF_FIGURE);
    }

    private Circle getCircle() {
        double radius = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        return new Circle(radius, randomColor.getRandomColor());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        double firstParallel = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        double secondParallel = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        double height = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        return new IsoscelesTrapezoid(firstParallel,
                secondParallel,
                height,
                randomColor.getRandomColor());
    }

    private Rectangle getRectangle() {
        double length = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        double width = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        return new Rectangle(length, width, randomColor.getRandomColor());
    }

    private RightTriangle getRightTriangle() {
        double firstLeg = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        double secondLeg = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        return new RightTriangle(firstLeg, secondLeg, randomColor.getRandomColor());
    }

    private Square getSquare() {
        double side = SETTING_FOR_GENERATING_DOUBLE_NUMBER * random.nextDouble()
                + random.nextInt(MAX_VALUE_FOR_CALCULATIONS)
                - SETTING_FOR_GENERATING_RANDOM_NUMBER_MINUS_ONE;
        return new Square(side, randomColor.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS_FOR_CIRCLE, Color.WHITE);
    }
}
