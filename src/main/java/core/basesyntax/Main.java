package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random);
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].drawInfo();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawInfo();
            }
        }
    }
}
