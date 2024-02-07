package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int TOTAL_FIGURE_TYPES = 5;
    private static final int FIGURE_SIDE_MAX_SIZE = 55;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureTypeIndex = random.nextInt(TOTAL_FIGURE_TYPES);
        switch (figureTypeIndex) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return square;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setSideA(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        rectangle.setSideB(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return rectangle;
    }

    private Figure getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        rightTriangle.setSecondLeg(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return rightTriangle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return circle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setBottomSide(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        isoscelesTrapezoid.setUpperSide(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return isoscelesTrapezoid;
    }
}
