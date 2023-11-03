package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random FIGURE_INDEX = new Random();
    private static final Random FIRST_SIDE = new Random();
    private static final Random SECOND_SIDE = new Random();
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();

    public Figure getRandomFigure() {
        final int index = FIGURE_INDEX.nextInt(5);
        final int firstSide = FIRST_SIDE.nextInt(1, 10);
        final int secondSide = SECOND_SIDE.nextInt(1, 10);
        switch (index) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(firstSide);
                circle.setColor(new ColorSupplier().getRandomColor());
                return circle;
            case 1:
                Square square = new Square();
                square.setSide(firstSide);
                square.setColor(new ColorSupplier().getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(firstSide);
                rectangle.setHeight(secondSide);
                rectangle.setColor(new ColorSupplier().getRandomColor());
                return rectangle;
            case 3:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(firstSide);
                isoscelesTrapezoid.setHeight(secondSide);
                isoscelesTrapezoid.setColor(new ColorSupplier().getRandomColor());
                return isoscelesTrapezoid;
            case 4:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(firstSide);
                rightTriangle.setSecondLeg(secondSide);
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
