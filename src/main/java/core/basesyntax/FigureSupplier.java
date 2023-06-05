package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public AbstractFigure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return getRandomSquare(color);
            case 1:
                return getRandomRectangle(color);
            case 2:
                return getRandomRightTriangle(color);
            case 3:
                return getRandomCircle(color);
            default:
                return getRandomIsoscelesTrapezoid(color);
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square getRandomSquare(String color) {
        double side = getRandomParameter();
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle(String color) {
        double length = getRandomParameter();
        double width = getRandomParameter();
        return new Rectangle(color, length, width);
    }

    private RightTriangle getRandomRightTriangle(String color) {
        double firstLeg = getRandomParameter();
        double secondLeg = getRandomParameter();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Circle getRandomCircle(String color) {
        double radius = getRandomParameter();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color) {
        double topBase = getRandomParameter();
        double bottomBase = getRandomParameter();
        double height = getRandomParameter();
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }

    private double getRandomParameter() {
        return random.nextDouble() * 10 + 1;
    }
}
