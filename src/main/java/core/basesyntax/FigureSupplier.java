package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_RANDOM_NUMBER = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(AMOUNT_OF_FIGURES);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_COLOR.name());
    }
}
