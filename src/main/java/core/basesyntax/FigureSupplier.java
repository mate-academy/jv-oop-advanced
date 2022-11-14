package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 3;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();
    private int randomNum = random.nextInt(MAX_NUMBER);

    private Figure getRandomSquare() {
        return new Square(randomColor.getRandomColor(), random.nextInt(randomNum));
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextInt(randomNum), random.nextInt(randomNum));
    }

    private Figure getRandomCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextInt(randomNum));
    }

    private Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                random.nextInt(randomNum),
                random.nextInt(randomNum), random.nextInt(randomNum));
    }

    public Figure getRandomFigure() {

        switch (randomNum) {
            case 1:
                return getRandomCircle();

            case 2:
                return getRandomTriangle();

            case 3:
                return getRandomSquare();

            default:
                return getRandomTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
