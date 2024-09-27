package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_FIGURE_RADIUS = 10.0;
    private static final double MAX_VALUE = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(this.FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return createSquare(randomColor);
            case 1:
                return createRectangle(randomColor);
            case 2:
                return createRightTriangle(randomColor);
            case 3:
                return createCircle(randomColor);
            default:
                return createIsoscelesTrapezoid(randomColor);
        }
    }

    public Square createSquare(String color) {
        double side = random.nextDouble() * MAX_VALUE;
        return new Square(color, side);
    }

    public Rectangle createRectangle(String color) {
        double length = random.nextDouble() * MAX_VALUE;
        double width = random.nextDouble() * MAX_VALUE;
        return new Rectangle(color, length, width);
    }

    public RightTriangle createRightTriangle(String color) {
        double firstLeg = random.nextDouble() * MAX_VALUE;
        double secondLeg = random.nextDouble() * MAX_VALUE;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Circle createCircle(String color) {
        double radius = random.nextDouble() * MAX_VALUE;
        return new Circle(color, radius);
    }

    public IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        double topBase = random.nextDouble() * MAX_VALUE;
        double bottomBase = random.nextDouble() * MAX_VALUE;
        double height = random.nextDouble() * MAX_VALUE;
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_FIGURE_RADIUS);
    }
}
