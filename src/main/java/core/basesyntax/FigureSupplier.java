package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final double MAX_VALUE = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(COUNT_FIGURE);
        switch (figure) {
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

    public Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double radius = random.nextDouble() * MAX_VALUE;
        return new Circle(color, radius);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double topBase = random.nextDouble() * MAX_VALUE;
        double bottomBase = random.nextDouble() * MAX_VALUE;
        double height = random.nextDouble() * MAX_VALUE;
        return new IsoscelesTrapezoid(color, topBase, height, bottomBase);
    }

    public Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double height = random.nextDouble() * MAX_VALUE;
        double width = random.nextDouble() * MAX_VALUE;
        return new Rectangle(color, height, width);
    }

    public RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = random.nextDouble() * MAX_VALUE;
        double secondLeg = random.nextDouble() * MAX_VALUE;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double side = random.nextDouble() * MAX_VALUE;
        return new Square(color, side);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
