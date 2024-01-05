package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 9;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Figure square = new Square(random.nextInt(MIN_SIZE, MAX_SIZE),
            new ColorSupplier().getRandomColor());
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(MIN_SIZE, MAX_SIZE),
            random.nextInt(MIN_SIZE, MAX_SIZE), random.nextInt(MIN_SIZE, MAX_SIZE),
            new ColorSupplier().getRandomColor());
    private Figure rightTriangle = new RightTriangle(random.nextInt(MIN_SIZE, MAX_SIZE),
            random.nextInt(MIN_SIZE, MAX_SIZE),
            new ColorSupplier().getRandomColor());
    private Figure circle = new Circle(random.nextInt(MIN_SIZE, MAX_SIZE),
            new ColorSupplier().getRandomColor());
    private Figure rectangle = new Rectangle(random.nextInt(MIN_SIZE, MAX_SIZE),
            random.nextInt(MIN_SIZE, MAX_SIZE),
            new ColorSupplier().getRandomColor());
    private Figure[] figures = new Figure[] {rectangle, circle, rightTriangle,
            isoscelesTrapezoid, square};

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
