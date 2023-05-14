package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUE = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                int radius = random.nextInt(MAX_VALUE);
                Circle circle = new Circle(radius);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 1:
                int at = random.nextInt(MAX_VALUE);
                int bt = random.nextInt(MAX_VALUE);
                int ht = random.nextInt(MAX_VALUE);
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(at, bt, ht);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case 2:
                int width = random.nextInt(MAX_VALUE);
                int height = random.nextInt(MAX_VALUE);
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                int firstLeg = random.nextInt(MAX_VALUE);
                int secondLeg = random.nextInt(MAX_VALUE);
                RightTriangle rightTriangle = new RightTriangle(firstLeg, secondLeg);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            default:
                int side = random.nextInt(MAX_VALUE);
                Square square = new Square(side);
                square.setColor(colorSupplier.getRandomColor());
                return square;
            }
        }

    public Figure getDefaultFigure() {
        int radius = 10;
        Circle circle = new Circle(radius);
        circle.setColor("WHITE");
        return circle;
    }
}
