package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURE_NAME = 100;
    private static final int FIGURE = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        if (random.nextInt(FIGURE) == 0) {
            Figure figure = new Circle(random.nextInt(FIGURE_NAME));
            figure.setColor(getRandomColor());
            return figure;
        }
        if (random.nextInt(FIGURE) == 1) {
            Figure figure = new Square(random.nextInt(FIGURE_NAME));
            figure.setColor(getRandomColor());
            return figure;
        }
        if (random.nextInt(FIGURE) == 2) {
            Figure figure = new Rectangle(random.nextInt(FIGURE_NAME),
                    random.nextInt(FIGURE_NAME));
            figure.setColor(getRandomColor());
            return figure;
        }
        if (random.nextInt(FIGURE) == 3) {
            Figure figure = new RightTriangle(random.nextInt(FIGURE_NAME),
                    random.nextInt(FIGURE_NAME));
            figure.setColor(getRandomColor());
            return figure;
        }
        if (random.nextInt(FIGURE) == 4) {
            Figure figure = new IsoscelesTrapezoid(random.nextInt(FIGURE_NAME),
                    random.nextInt(FIGURE_NAME));
            figure.setColor(getRandomColor());
            return figure;
        }

        return getRandomFigure();
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(10);
        figure.setColor(Color.WHITE);
        return figure;
    }
}
