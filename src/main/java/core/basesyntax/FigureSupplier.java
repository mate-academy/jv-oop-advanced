package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_SIZE = 100;
    private final Random random = new Random();
    private final Color randomColor = Color.valueOf(new ColorSupplier().getRandomColor());

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }

    public Figure getRandomCircle() {
        int randomRadius = random.nextInt(MAX_SIZE);
        return new Circle(randomRadius, randomColor);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int randomSide1 = random.nextInt(MAX_SIZE);
        int randomSide2 = random.nextInt(MAX_SIZE);
        int randomSide3 = random.nextInt(MAX_SIZE);
        return new IsoscelesTrapezoid(
                randomSide1,
                randomSide2,
                randomSide3,
                randomColor);
    }

    public Figure getRandomRectangle() {
        int randomSide1 = random.nextInt(MAX_SIZE);
        int randomSide2 = random.nextInt(MAX_SIZE);
        return new Rectangle(randomSide1, randomSide2, randomColor);
    }

    public Figure getRandomRightTriangle() {
        int randomSide1 = random.nextInt(MAX_SIZE);
        int randomSide2 = random.nextInt(MAX_SIZE);
        return new RightTriangle(randomSide1, randomSide2, randomColor);
    }

    public Figure getRandomSquare() {
        int randomSide = random.nextInt(MAX_SIZE);
        return new Square(randomSide, randomColor);
    }
}
