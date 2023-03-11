package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int CIRCLE_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        Circle circle = new Circle(colorSupplier.getRandomColor(), random.nextInt(100));
        Square square = new Square(colorSupplier.getRandomColor(), random.nextInt(100));
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(100), random.nextInt(100));
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(100),
                random.nextInt(100));
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier
                .getRandomColor(),
                random.nextInt(100), random.nextInt(100), random
                .nextInt(100));
        Figure[] figures = new Figure[]{circle, square, rightTriangle,
                rectangle, isoscelesTrapezoid};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), CIRCLE_RADIUS);
    }
}
