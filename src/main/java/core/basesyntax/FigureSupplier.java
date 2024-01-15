package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_PROPERTY_VALUE = 30;
    private static final int MIN_FIG_VALUE = 1;
    private static final double DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setColor(DEFAULT_COLOR);
        defaultFigure.setRadius(DEFAULT_RADIUS);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        switch (FigureEnum.values()[random.nextInt(FigureEnum.values().length)]) {
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case SQUARE:
            default:
                return getRandomSquare();
        }
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        return circle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setFirstBase(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        isoscelesTrapezoid.setSecondBase(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        return isoscelesTrapezoid;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setFirstSide(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        rectangle.setSecondSide(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        return rectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        rightTriangle.setSecondLeg(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        return rightTriangle;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_FIGURE_PROPERTY_VALUE) + MIN_FIG_VALUE);
        return square;
    }
}
