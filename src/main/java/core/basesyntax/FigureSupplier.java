package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_FIGURES = 5;
    private static final int LENGTH_MAX = 100;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final double CIRCLE_DEFAULT_AREA = 314.0;

    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int choice = random.nextInt(NUMBER_FIGURES);
        switch (choice) {
            case 1:
                Circle circle = new Circle();
                circle.setColor(color.getRandomColor());
                circle.setRadius(random.nextInt(LENGTH_MAX));

                return circle;
            case 2:
                Square square = new Square();
                square.setColor(color.getRandomColor());
                square.setSide(random.nextInt(LENGTH_MAX));
                return square;
            case 3:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(color.getRandomColor());
                rectangle.setSide1(random.nextInt(LENGTH_MAX));
                rectangle.setSide2(random.nextInt(LENGTH_MAX));
                return rectangle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(color.getRandomColor());
                isoscelesTrapezoid.setFirstLeg(random.nextInt(LENGTH_MAX));
                isoscelesTrapezoid.setSecondLeg(random.nextInt(LENGTH_MAX));
                return isoscelesTrapezoid;
            default:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(color.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(LENGTH_MAX));
                rightTriangle.setSecondLeg(random.nextInt(LENGTH_MAX));
                return rightTriangle;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), CIRCLE_DEFAULT_AREA, CIRCLE_DEFAULT_RADIUS);
    }
}
