package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random r = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = {new Circle(colorSupplier.getRandomColor(), r.nextInt(0, 1000)),
                new Square(colorSupplier.getRandomColor(), r.nextInt(0, 1000)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        r.nextInt(0, 1000), r.nextInt(0, 1000)),
                new Rectangle(colorSupplier.getRandomColor(), r.nextInt(0, 1000),
                        r.nextInt(0, 1000)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    r.nextInt(0, 1000), r.nextInt(0, 1000), r.nextInt(0, 1000))};
        return figures[r.nextInt(0, 5)];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
