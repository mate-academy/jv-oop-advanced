package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle("Circle", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(12) + 4),
                new Square("Square", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(17) + 5),
                new Rectangle("Rectangle", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(15) + 10, new Random().nextInt(10) + 5),
                new RightTriangle("Right triangle", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(15) + 10),
                new IsoscelesTrapezoid("IsoscelesTrapezoid", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 5,
                        new Random().nextInt(17) + 11,
                        new Random().nextInt(18) + 10)
        };

        return figures[new Random().nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", "white", 10);
    }
}
