package core.basesyntax;

import core.basesyntax.figures.Figure;
import java.util.Random;

public class Main {
    public static final int FIGURES_COUNT = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] allFigure = new Figure[random.nextInt(FIGURES_COUNT)];

        for (int i = 0; i < allFigure.length; i++) {
            allFigure[i] = new FigureSupplier().getFigure();
        }

        for (Figure figure : allFigure) {
            figure.draw();
        }
    }
}
