package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_BOUND = 5;
    private final Random random = new Random();
    private final String getRandomColor = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(MAX_BOUND) + 1;
        switch (randomFigure) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 5:
                return getRandomRectangle();
            default:
                return defaultFigure();
        }
    }

    public Figure defaultFigure() {
        return new Circle(Color.WHITE.getValue(),DEFAULT_RADIUS);
    }

    public Figure getRandomCircle() {
        int randomRadius = random.nextInt(MAX_NUMBER);
        return new Circle(getRandomColor, randomRadius);
    }

    public Figure getRandomSquare() {
        int randomSide = random.nextInt(MAX_NUMBER);
        return new Square(getRandomColor, randomSide);
    }

    public Figure getRandomRightTriangle() {
        int randomBase = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new RightTriangle(getRandomColor, randomBase, randomHeight);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int randomBaseOne = random.nextInt(MAX_NUMBER);
        int randomBaseTwo = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(getRandomColor,randomBaseOne,randomBaseTwo,randomHeight);
    }

    public Figure getRandomRectangle() {
        int randomWight = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new Rectangle(getRandomColor,randomWight,randomHeight);
    }
}
