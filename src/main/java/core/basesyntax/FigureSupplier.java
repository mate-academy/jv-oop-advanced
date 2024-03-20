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
        isoscelesTrapezoid.setFirstBasis(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setSecondBasis(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(FIGURE_COUNT));
        rightTriangle.setSecondLeg(random.nextInt(FIGURE_COUNT));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(FIGURE_COUNT));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    public Square getSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(FIGURE_COUNT));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    public Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextInt(FIGURE_COUNT));
        rectangle.setWidth(random.nextInt(FIGURE_COUNT));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public Figure getDefoltFigure() {
        Circle defoltFigure = new Circle();
        defoltFigure.setColor(DEFAULT_COLOR);
        defoltFigure.setRadius(DEFAULT_NUMBER);
        return defoltFigure;
    }

    public Figure getRandomFigure() {
        int figurename = random.nextInt(FIGURE_COUNT);
        switch (figurename) {
            case 0: return getIsoscelesTrapezoid();
            case 1: return getRightTriangle();
            case 2: return getCircle();
            case 3: return getSquare();
            case 4: return getRectangle();
            default: return getDefoltFigure();
        }
    }
}

