package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Figure[] figures = new Figure[FIGURE_COUNT];
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    // random figures with random colors
    public FigureSupplier() {
        figures[0] = new Circle(random.nextInt(20),
                randomColor.getRandomColor());
        figures[1] = new IsoscelesTrapezoid(random.nextInt(20),
                random.nextInt(20), random.nextInt(20),
                randomColor.getRandomColor());
        figures[2] = new Rectangle(random.nextInt(20),
                random.nextInt(20),
                randomColor.getRandomColor());
        figures[3] = new RightTriangle(random.nextInt(20),
                random.nextInt(20),
                randomColor.getRandomColor());
        figures[4] = new Square(random.nextInt(20),
                randomColor.getRandomColor());
    }

    public Figure getRandomFigure() {
        return figures[random.nextInt(FIGURE_COUNT)];
    }
}
