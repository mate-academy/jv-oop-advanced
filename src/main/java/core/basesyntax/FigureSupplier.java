package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int FIGURE_LENGTH = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MIN_RANDOM_NUMBER = 1;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_LENGTH);
        switch (type) {
            case 0: return getCircle();
            case 1: return getIsoscelesTrapezoid();
            case 2: return getRightTriangle();
            case 3: return getRectangle();
            default: return getSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, "white");
    }

    public Figure getCircle() {
        double randomNumber = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        return new Circle(randomNumber, randomColor.getRandomColor());
    }

    public Figure getIsoscelesTrapezoid() {
        double firstBases = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        double secondBases = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        double height = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        return new IsoscelesTrapezoid(
                firstBases,
                secondBases,
                height,
                randomColor.getRandomColor()
        );
    }

    public Figure getRightTriangle() {
        double firstLeg = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        double secondLeg = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        return new RightTriangle(firstLeg, secondLeg, randomColor.getRandomColor());
    }

    public Figure getRectangle() {
        double width = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        double height = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        return new Rectangle(width, height, randomColor.getRandomColor());
    }

    public Figure getSquare() {
        double side = Math.max(MIN_RANDOM_NUMBER, random.nextInt(MAX_RANDOM_NUMBER));;
        return new Square(side, randomColor.getRandomColor());
    }
}
