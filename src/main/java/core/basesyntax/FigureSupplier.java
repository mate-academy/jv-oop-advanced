package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = {new Circle(colorSupplier.getRandomColor(),random.nextDouble(BOUND)),
            new Square(colorSupplier.getRandomColor(), random.nextDouble(BOUND)),
            new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                    random.nextDouble(BOUND)),
            new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                    random.nextDouble(BOUND), random.nextDouble(BOUND)),
            new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                    random.nextDouble(BOUND))};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
