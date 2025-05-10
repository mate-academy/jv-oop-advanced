package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE_OF_FIGURE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new IsoscelesTrapezoid(
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),

                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        colorSupplier.getRandomColor()),
                new RightTriangle(
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        colorSupplier.getRandomColor()),
                new Square(
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        colorSupplier.getRandomColor()),
                new Circle(
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        colorSupplier.getRandomColor()),
                new Rectangle(
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        random.nextInt(MAX_RANDOM_VALUE_OF_FIGURE),
                        colorSupplier.getRandomColor())};
        return figures[random.nextInt(figures.length)];
    }
}
