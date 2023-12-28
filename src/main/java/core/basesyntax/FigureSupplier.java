package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int constant = 10;

    public Figure getRandomFigure() {
        Figure[] figures = {new Circle(colorSupplier.getRandomColor(), random.nextInt(0, 1000)),
                new Square(colorSupplier.getRandomColor(), random.nextInt(0, 1000)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(0, 1000), random.nextInt(0, 1000)),
                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(0, 1000),
                        random.nextInt(0, 1000)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(0, 1000), random.nextInt(0, 1000), random.nextInt(0, 1000))};
        return figures[random.nextInt(0, 5)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), constant);
    }
}
