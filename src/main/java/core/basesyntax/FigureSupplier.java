package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure circle = new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 100);
    private Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble()
            * 100, random.nextDouble() * 100);
    private Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
            random.nextDouble() * 100, random.nextDouble() * 100);
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextDouble() * 100, random.nextDouble() * 100,
            random.nextDouble() * 100);
    private Figure square = new Square(colorSupplier.getRandomColor(), random.nextDouble() * 100);
    private Figure defaultFigure = new Circle(Color.WHITE.name(), 10.0);

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[5];
        figures[0] = circle;
        figures[1] = rectangle;
        figures[2] = rightTriangle;
        figures[3] = isoscelesTrapezoid;
        figures[4] = square;
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
