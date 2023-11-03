package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_INDEX = new Random().nextInt(5);
    private static final int FIRST_SIDE = new Random().nextInt(1,10);
    private static final int SECOND_SIDE = new Random().nextInt(1,10);
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();

    public Figure getRandomFigure() {
        switch (FIGURE_INDEX) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(FIRST_SIDE);
                circle.setColor(new ColorSupplier().getRandomColor());
                return circle;
            case 1:
                Square square = new Square();
                square.setSide(FIRST_SIDE);
                square.setColor(new ColorSupplier().getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(FIRST_SIDE);
                rectangle.setHeight(SECOND_SIDE);
                rectangle.setColor(new ColorSupplier().getRandomColor());
                return rectangle;
            case 3:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(FIRST_SIDE);
                isoscelesTrapezoid.setHeight(SECOND_SIDE);
                isoscelesTrapezoid.setColor(new ColorSupplier().getRandomColor());
                return isoscelesTrapezoid;
            case 4:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(FIRST_SIDE);
                rightTriangle.setSecondLeg(SECOND_SIDE);
                rightTriangle.setColor(new ColorSupplier().getRandomColor());
                return rightTriangle;
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
