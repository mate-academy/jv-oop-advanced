package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int DEFAULT_RADIUS = 10;
    public static final int NUMBER_OF_TYPES_OF_FIGURES = 5;
    public static final int MAX_BOUND_FOR_SIDE = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(NUMBER_OF_TYPES_OF_FIGURES);
        switch (randomFigure) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(getRandomNumber());
                return circle;
            case 1:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(getRandomNumber());
                return square;
            case 2:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setBase(getRandomNumber());
                rightTriangle.setHeight(getRandomNumber());
                return rightTriangle;
            case 3:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setLength(getRandomNumber());
                rectangle.setWidth(getRandomNumber());
                return rectangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setHeight(getRandomNumber());
                isoscelesTrapezoid.setLongBase(getRandomNumber());
                isoscelesTrapezoid.setShortBase(getRandomNumber());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }

    private double getRandomNumber() {
        return random.nextDouble(MAX_BOUND_FOR_SIDE);
    }
}
