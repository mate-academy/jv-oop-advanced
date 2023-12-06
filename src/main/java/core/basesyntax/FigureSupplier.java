package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_TYPES = 5;
    private static final int FIGURE_SIDE_MAX_SIZE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_FIGURE_TYPES);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getIsoscelesTrapezoid();
            case 4:
                return getRightTriangle();
            default:
                return getDefaultFigure();
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
        rectangle.setHeight(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        rectangle.setWidth(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return rectangle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return circle;
    }

    private Figure getRightTriangle() {
        RightTriangle righttriangle = new RightTriangle();
        righttriangle.setColor(colorSupplier.getRandomColor());
        righttriangle.setFirstLeg(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        righttriangle.setSecondLeg(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return righttriangle;
    }

    private Figure getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelestrapezoid = new IsoscelesTrapezoid();
        isoscelestrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelestrapezoid.setUpperBase(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        isoscelestrapezoid.setLowerBase(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        isoscelestrapezoid.setHeight(random.nextInt(FIGURE_SIDE_MAX_SIZE));
        return isoscelestrapezoid;
    }
}
