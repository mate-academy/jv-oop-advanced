package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Circle circle = new Circle(colorSupplier.getRandomColor(), new Random().nextInt(100));
        IsoscelesTrapezoid isoscelesTrapezoid =
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100));
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                new Random().nextInt(100),
                new Random().nextInt(100));
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                new Random().nextInt(100),
                new Random().nextInt(100));
        Square square = new Square(colorSupplier.getRandomColor(),
                new Random().nextInt(100));
        Figure[] figures = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        return figures[new Random().nextInt(5)];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
