package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_NUMBER = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstBasis(random.nextInt());
        isoscelesTrapezoid.setSecondBasis(random.nextInt());
        isoscelesTrapezoid.setHeight(random.nextInt());
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt());
        rightTriangle.setSecondLeg(random.nextInt());
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt());
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    public Square getSquare() {
        Square square = new Square();
        square.setSide(random.nextInt());
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    public Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextInt());
        rectangle.setWidth(random.nextInt());
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setColor(DEFAULT_COLOR);
        defaultFigure.setRadius(DEFAULT_NUMBER);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        int figurename = random.nextInt(FIGURE_COUNT);
        switch (figurename) {
            case 0: return getIsoscelesTrapezoid();
            case 1: return getRightTriangle();
            case 2: return getCircle();
            case 3: return getSquare();
            case 4: return getRectangle();
            default: return getDefaultFigure();
        }
    }
}

