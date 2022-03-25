package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT = 10;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 11;

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Colors.white.toString(), DEFAULT);
        return figure;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier rcolor = new ColorSupplier();

        Figure[] figures = {new Circle(rcolor.getRandomColor(),
                random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND),
                new Square(rcolor.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND),
                new RightTriangle(rcolor.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND),
                new Rectangle(rcolor.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND),
                new IsoscelesTrapezoid(rcolor.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND)};
        Figure figure = figures[random.nextInt(figures.length)];

        return figure;
    }
}
