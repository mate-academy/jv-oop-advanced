package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE = 25;
    private static final int MAX_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT) + 1;
        switch (index) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Square getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_SIDE) + 1);
        return square;
    }

    public Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_RADIUS) + 1);
        return circle;
    }

    public Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setWidth(random.nextInt(MAX_SIDE) + 1);
        rectangle.setHeight(random.nextInt(MAX_SIDE) + 1);
        return rectangle;
    }

    public RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(MAX_SIDE) + 1);
        rightTriangle.setSecondLeg(random.nextInt(MAX_SIDE) + 1);
        return rightTriangle;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setFirstBase(random.nextInt(MAX_SIDE) + 1);
        isoscelesTrapezoid.setSecondBase(random.nextInt(MAX_SIDE) + 1);
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_SIDE) + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(MAX_RADIUS);
        return circle;
    }
}
