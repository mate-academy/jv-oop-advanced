package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_MAX = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Square square = new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM_MAX));
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX));
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX));
        Circle circle = new Circle(colorSupplier.getRandomColor(), random.nextInt(RANDOM_MAX));
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX), random.nextInt(RANDOM_MAX));
        Figure[] figures = new Figure[]{square, rectangle, rightTriangle, circle, isoscelesTrapezoid};
        return figures[random.nextInt(figures.length)];
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
