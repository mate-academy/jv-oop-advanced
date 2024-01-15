package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIDE_SIZE = 11;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        return circle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        return square;
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        rectangle.setWidth(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        rightTriangle.setSecondLeg(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        isoscelesTrapezoid.setUpSide(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        isoscelesTrapezoid.setDownSide(random.nextInt(MAX_FIGURE_SIDE_SIZE));
        return isoscelesTrapezoid;
    }
}
