package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANGE_BOUND = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAXIMUM_LENGTH = 50;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(RANGE_BOUND);
        int randomSideOne = 1 + random.nextInt(MAXIMUM_LENGTH);
        int randomSideTwo = 1 + random.nextInt(MAXIMUM_LENGTH);
        int randomSideThree = 1 + random.nextInt(MAXIMUM_LENGTH);
        switch (randomInt) {
            case 0:
                figure = new Square(randomSideOne);
                break;
            case 1:
                figure = new Rectangle(randomSideOne, randomSideTwo);
                break;
            case 2:
                figure = new RightTriangle(randomSideOne, randomSideTwo);
                break;
            case 3:
                figure = new Circle(randomSideOne);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(randomSideOne, randomSideTwo,
                        randomSideThree);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        figure = circle;
        figure.setColor(Color.White);
        return figure;
    }
}
