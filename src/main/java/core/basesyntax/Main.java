package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int FIGURE_NUMBER_LIMIT = 12;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(FIGURE_NUMBER_LIMIT)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
