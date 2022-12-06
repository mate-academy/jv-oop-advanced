package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int SIZE_COUNT = 15;
    public static final int DEFAULT_NUMBER = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(SIZE_COUNT));
                return circle;
            case 1:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(SIZE_COUNT));
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(random.nextInt(SIZE_COUNT));
                rectangle.setSecondSide(random.nextInt(SIZE_COUNT));
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(SIZE_COUNT));
                rightTriangle.setSecondLeg(random.nextInt(SIZE_COUNT));
                return rightTriangle;
            case 4:
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setFirstBase(random.nextInt(SIZE_COUNT));
                isoscelesTrapezoid.setSecondBase(random.nextInt(SIZE_COUNT));
                isoscelesTrapezoid.setHeight(random.nextInt(SIZE_COUNT));
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor(DEFAULT_COLOR);
        defaultCircle.setRadius(DEFAULT_NUMBER);
        return defaultCircle;
    }
}
