package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(MAX_NUMBER);

        switch (randomNumber) {
            case 0:
                return getRandomCircle();

            case 1:
                return getRandomTriangle();

            case 2:
                return getRandomSquare();

            default:
                return getRandomTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomSquare() {
        return new Square(randomColor.getRandomColor(), random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
    }
}
