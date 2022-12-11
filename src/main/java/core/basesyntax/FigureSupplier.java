package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_PROPERTY_VALUE = 30;
    private static final int MIN_FIG_VALUE = 1;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.getValue();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Circle defaultFigure = new Circle();

    public Figure getDefaultFigure() {
        defaultFigure.setColor(DEFAULT_COLOR);
        defaultFigure.setRadius(DEFAULT_RADIUS);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        switch ((FigureList.values()[random.nextInt(FigureList.values().length)]).getValue()) {
            case "circle":
                return getRandomCircle();
            case "isosceles trapezoid":
                return getRandomIsoscelesTrapezoid();
            case "rectangle":
                return getRandomRectangle();
            case "right triangle":
                return getRandomRightTriangle();
            case "square":
                return getRandomSquare();
            default:
                System.out.println("not match");
                return getDefaultFigure();
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
