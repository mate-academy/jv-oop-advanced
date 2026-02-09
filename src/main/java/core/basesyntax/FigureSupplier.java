package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();
    private final int MAX_RANDOM_NUMBER = 50;
    
    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        switch (type) {
            case 0: return getCircle();
            case 1: return getIsoscelesTrapezoid();
            case 2: return getRightTriangle();
            case 3: return getRectangle();
            default: return getSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    public Figure getCircle() {
        double randomNumber = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        return new Circle(randomNumber, randomColor.getRandomColor());
    }

    public Figure getIsoscelesTrapezoid() {
        double firstBases = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        double secondBases = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        double height = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        return new IsoscelesTrapezoid(
                firstBases,
                secondBases,
                height,
                randomColor.getRandomColor()
        );
    }

    public Figure getRightTriangle() {
        double firstLeg = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        double secondLeg = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        return new RightTriangle(firstLeg, secondLeg, randomColor.getRandomColor());
    }

    public Figure getRectangle() {
        double width = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        double height = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        return new Rectangle(width, height, randomColor.getRandomColor());
    }

    public Figure getSquare() {
        double side = Math.max(1, random.nextInt(MAX_RANDOM_NUMBER));;
        return new Square(side, randomColor.getRandomColor());
    }
}
