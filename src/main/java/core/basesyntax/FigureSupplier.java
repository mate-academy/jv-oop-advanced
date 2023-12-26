package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random r = new Random();
        Figure[] figures = {new Circle(new ColorSupplier().getRandomColor(), r.nextInt()),
                new Square(new ColorSupplier().getRandomColor(), r.nextInt()),
            new RightTriangle(new ColorSupplier().getRandomColor(), r.nextInt(), r.nextInt()),
            new Rectangle(new ColorSupplier().getRandomColor(), r.nextInt(), r.nextInt()),
            new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                    r.nextInt(), r.nextInt(), r.nextInt())};
        return figures[r.nextInt(0, 5)];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
