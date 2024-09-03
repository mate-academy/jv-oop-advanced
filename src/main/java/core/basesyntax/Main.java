package core.basesyntax;

import java.util.Random;

public class Main {
    static final Random random = new Random();

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        FigureSupplier figure = new FigureSupplier();
        Figure[] allFigures = new Figure[6];
        for (int i = 0; i < allFigures.length / 2; i++) {
            allFigures[i] = figure.getRandomFigure(figures);
        }

        for (int j = allFigures.length / 2; j < allFigures.length; j++) {
            allFigures[j] = figure.getDefaultFigure();
        }

        for (int i = 0; i < allFigures.length; i++) {
            allFigures[i].draw();
        }
    }
}
