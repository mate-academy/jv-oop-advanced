package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 6;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final double DEFAULT_NUMBER = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(FIGURE_COUNT));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    public Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextInt(FIGURE_COUNT));
        rectangle.setWidth(random.nextInt(FIGURE_COUNT));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setSide(random.nextInt(FIGURE_COUNT));
        rightTriangle.setHigh(random.nextInt(FIGURE_COUNT));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public Square getSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(FIGURE_COUNT));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHigh(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setFirstSide(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setSecondSide(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure = new Figure();
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getSquare();
            default:
                return getIsoscelesTrapezoid();

        }

    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_NUMBER);
        return circle;
    }

}

