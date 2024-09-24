package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public ColorSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(ColorSupplier supplier) {
        this.supplier = supplier;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                supplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
        Rectangle rectangle = new Rectangle(
                supplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
        Circle circle = new Circle(
                supplier.getRandomColor(),
                random.nextDouble());
        RightTriangle rightTriangle = new RightTriangle(
                supplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
        Square square = new Square(
                supplier.getRandomColor(),
                random.nextDouble());
        Figure[] figures = {isoscelesTrapezoid, rectangle, circle, rightTriangle, square};
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_COLOR,
                random.nextDouble());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
