package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_SIDE_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_NUMBER);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();

        }
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(MAX_SIDE_NUMBER),
                Color.valueOf(colorSupplier.getRandomColor()));
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_SIDE_NUMBER), random.nextInt(MAX_SIDE_NUMBER),
                Color.valueOf(colorSupplier.getRandomColor()));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_SIDE_NUMBER), random.nextInt(MAX_SIDE_NUMBER),
                Color.valueOf(colorSupplier.getRandomColor()));
    }

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_SIDE_NUMBER),
                Color.valueOf(colorSupplier.getRandomColor()));
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE_NUMBER),
                random.nextInt(MAX_SIDE_NUMBER),
                random.nextInt(MAX_SIDE_NUMBER),
                Color.valueOf(colorSupplier.getRandomColor()));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);

    }
}

