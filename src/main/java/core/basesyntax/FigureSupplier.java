package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_SIZE = 20;
    private static Random random = new Random();

    public Figures getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();

        Figures[] figures = {
                new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_SIZE)),
                new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_SIZE), random.nextInt(MAX_RANDOM_SIZE)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_SIZE), random.nextInt(MAX_RANDOM_SIZE)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_SIZE), random.nextInt(MAX_RANDOM_SIZE),
                        random.nextInt(MAX_RANDOM_SIZE)),
                new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_SIZE))};

        return figures[random.nextInt(figures.length - 1)];
    }

    public Figures getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
