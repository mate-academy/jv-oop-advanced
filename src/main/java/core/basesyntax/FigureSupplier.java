package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        final int Limit = 10;
        Square square = new Square(colorSupplier.getRandomColor(), random.nextInt(Limit));
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(Limit), random.nextInt(Limit));
        Circle circle = new Circle(colorSupplier.getRandomColor(), random.nextInt(Limit));
        IsoscelesTrapezoid isoscelesTrapezoid
                = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(Limit), random.nextInt(Limit),
                random.nextInt(Limit));
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(Limit),
                random.nextInt(Limit));
        Figure [] figures = new Figure[] {square, rightTriangle, circle,
            isoscelesTrapezoid, rectangle};
        return figures[random.nextInt(figures.length)];
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
