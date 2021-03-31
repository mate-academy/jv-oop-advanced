package core.basesyntax;

import java.util.Random;

public class Main {
    static final int FIGURES_LIMIT = 12;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(FIGURES_LIMIT)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
