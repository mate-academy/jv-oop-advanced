package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_UNIQUE_PROPERTY = 150;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String color = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int number = random.nextInt(NUMBER_OF_FIGURE);
        switch (number) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(color);
                circle.setRadius(random.nextInt(MAX_UNIQUE_PROPERTY));
                return circle;
            case 1:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(color);
                rectangle.setFirstSide(random.nextInt(MAX_UNIQUE_PROPERTY));
                rectangle.setSecondSide(random.nextInt(MAX_UNIQUE_PROPERTY));
                return rectangle;
            case 2:
                Square square = new Square();
                square.setColor(color);
                square.setSide(random.nextInt(MAX_UNIQUE_PROPERTY));
                return square;
            case 3:
                RightTriangle triangle = new RightTriangle();
                triangle.setColor(color);
                triangle.setFirstLeg(random.nextInt(MAX_UNIQUE_PROPERTY));
                triangle.setSecondLeg(random.nextInt(MAX_UNIQUE_PROPERTY));
                return triangle;
            default:
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
                trapezoid.setColor(color);
                trapezoid.setHeight(random.nextInt(MAX_UNIQUE_PROPERTY));
                trapezoid.setFirstBase(random.nextInt(MAX_UNIQUE_PROPERTY));
                trapezoid.setSecondBase(random.nextInt(MAX_UNIQUE_PROPERTY));
                return trapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.name().toLowerCase());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
