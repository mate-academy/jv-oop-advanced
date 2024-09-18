package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(supplier.getRandomColor(),
            random.nextDouble(), random.nextDouble(), random.nextDouble());
    private Figure rectangle = new Rectangle(supplier.getRandomColor(),
            random.nextDouble(), random.nextDouble(), random.nextDouble());
    private Figure circle = new Circle(supplier.getRandomColor(),
            random.nextDouble());
    private Figure rightTriangle = new RightTriangle(supplier.getRandomColor(),
            random.nextDouble(), random.nextDouble());
    private Figure square = new Square(supplier.getRandomColor(), random.nextDouble());
    private Figure [] figures = {isoscelesTrapezoid, rectangle, circle, rightTriangle, square};

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10.0);
    }
}
