package core.basesyntax;

import java.util.Random;

public class Main {
    static final Random random = new Random();

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        FigureSupplier figure = new FigureSupplier();
        Figure[] allFigures = new Figure[6];
        for (int i = 0; i < allFigures.length; i++) {
            if (i < allFigures.length / 2) {
                allFigures[i] = figure.getRandomFigure(figures);
            } else {
                allFigures[i] = figure.getDefaultFigure();
            }
            allFigures[i].draw();
        }

    }
}
