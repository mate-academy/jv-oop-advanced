package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANGE = 20;
    private final Random random = new Random();
    private final Circle circle = new Circle();
    private final Square square = new Square();
    private final RightTriangle rightTriangle = new RightTriangle();
    private final Rectangle rectangle = new Rectangle();
    private final IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);
    private final Figure[] figures = {circle, square, rightTriangle, rectangle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int randomNameFigure = random.nextInt(figures.length);
        switch (randomNameFigure) {
            case 0:
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MAX_RANGE) + 1);
                return circle;
            case 1:
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MAX_RANGE) + 1);
                return square;
            case 2:
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MAX_RANGE) + 1);
                rightTriangle.setSecondLeg(random.nextInt(MAX_RANGE) + 1);
                return rightTriangle;
            case 3:
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setWidth(random.nextInt(MAX_RANGE) + 1);
                rectangle.setLength(random.nextInt(MAX_RANGE) + 1);
                return rectangle;
            default:
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setHeight(random.nextInt(MAX_RANGE) + 1);
                isoscelesTrapezoid.setFirstSide(random.nextInt(MAX_RANGE) + 1);
                isoscelesTrapezoid.setSecondSide(random.nextInt(MAX_RANGE) + 1);
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
