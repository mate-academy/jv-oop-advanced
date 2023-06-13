package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANGE_BOUND = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = {
                new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANGE_BOUND)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_RANGE_BOUND), random.nextInt(MAX_RANGE_BOUND), random.nextInt(MAX_RANGE_BOUND), random.nextInt(MAX_RANGE_BOUND)),
                new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(), random.nextInt()),
                new Square(colorSupplier.getRandomColor(), random.nextInt()),
                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(), random.nextInt())
        };
        int index = random.nextInt(0, figures.length - 1);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

}
