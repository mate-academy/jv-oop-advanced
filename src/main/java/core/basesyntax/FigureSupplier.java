package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5; // range for random int values generator
    private final Figure[] figures = new Figure[FIGURE_COUNT]; // array of possible figures
    private final Random random = new Random(); // random int values generator

    // constructor for array possible figures initialize
    public FigureSupplier() {
        // random figure color
        ColorSupplier randomColor = new ColorSupplier();
        figures[0] = new Circle(random.nextInt(20),
                randomColor.getRandomColor());
        figures[1] = new IsoscelesTrapezoid(random.nextInt(20),
                random.nextInt(20),
                random.nextInt(20),
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

    // get random figure of possible figures
    public Figure getRandomFigure() {
        return figures[random.nextInt(FIGURE_COUNT)];
    }
}
