package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_DIMENSION_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "White";
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getCircle() {
        int radius = random.nextInt(MAX_DIMENSION_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        int height = random.nextInt(MAX_DIMENSION_VALUE);
        int firstSide = random.nextInt(MAX_DIMENSION_VALUE);
        int secondSide = random.nextInt(MAX_DIMENSION_VALUE);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(height, firstSide, secondSide, color);
    }

    public RightTriangle getRightTriangle() {
        int firstLeg = random.nextInt(MAX_DIMENSION_VALUE);
        int secondLeg = random.nextInt(MAX_DIMENSION_VALUE);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    public Rectangle getRectangle() {
        int firstSide = random.nextInt(MAX_DIMENSION_VALUE);
        int secondSide = random.nextInt(MAX_DIMENSION_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(firstSide, secondSide, color);
    }

    public Square getSquare() {
        int side = random.nextInt(MAX_DIMENSION_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRightTriangle();
            case 3:
                return getRectangle();
            default:
                return getSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
