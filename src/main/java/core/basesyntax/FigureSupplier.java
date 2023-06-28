package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Circle circle = new Circle(new ColorSupplier().getRandomColor(), new Random()
                .nextInt(100));
        Square square = new Square(new ColorSupplier().getRandomColor(), new Random()
                .nextInt(100));
        Rectangle rectangle = new Rectangle(new ColorSupplier().getRandomColor(), new Random()
                .nextInt(100), new Random().nextInt(100));
        RightTriangle rightTriangle = new RightTriangle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(100), new Random().nextInt(100));
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(new ColorSupplier()
                .getRandomColor(), new Random().nextInt(100), new Random()
                .nextInt(100), new Random().nextInt(100));
        Figure[] figures = new Figure[]
                {isoscelesTrapezoid, circle, rectangle, rightTriangle, square};
        return figures[new Random().nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
