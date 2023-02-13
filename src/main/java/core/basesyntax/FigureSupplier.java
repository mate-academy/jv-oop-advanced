package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int MAX_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(MAX_FIGURE);
        return switch (indexFigure) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomTrapezoid();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomRightTriangle();
            case 4 -> getRandomSquare();
            default -> getDefaultFigure();
        };
    }

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
