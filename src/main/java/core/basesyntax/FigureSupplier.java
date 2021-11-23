package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure circle = new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
        Figure trapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(20), random.nextInt(20), random.nextInt(20));
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(20), random.nextInt(20));
        Figure square = new Square(colorSupplier.getRandomColor(),
                random.nextInt(20), random.nextInt(20));
        Figure triangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(20), random.nextInt(20));
        Figure[] figures = {circle, trapezoid, rectangle, square, triangle};
        int index = random.nextInt(figures.length);
        return figures[index];
    }
}
