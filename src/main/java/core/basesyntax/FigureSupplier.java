package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int FIGURES_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int randomIndex = random.nextInt(FIGURES_COUNT);
        return switch (randomIndex) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomSquare();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomIsoscelesTrapezoid();
            default -> getRandomRightTriangle();
        };
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextDouble());
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomRightTriangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextDouble());
        rectangle.setWidth(random.nextDouble());
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextDouble());
        isoscelesTrapezoid.setSideA(random.nextDouble());
        isoscelesTrapezoid.setSideB(random.nextDouble());
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setHeight(random.nextDouble());
        rightTriangle.setBase(random.nextDouble());
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextDouble());
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR.name());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
