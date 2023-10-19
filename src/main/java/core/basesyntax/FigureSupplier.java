package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                Circle circle = new Circle(getRandomValue());
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 2:
                Square square = new Square(getRandomValue());
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case 3:
                Rectangle rectangle = new Rectangle(getRandomValue(), getRandomValue());
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 4:
                RightTriangle rightTriangle = new RightTriangle(getRandomValue(), getRandomValue());
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            default:
                double edge = getRandomValue();
                double sideA = getRandomValue();
                double sideB = getRandomValue();
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(edge, sideA, sideB);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }

    private double getRandomValue() {
        return random.nextInt(1000) / 100.00;
    }
}
