package core.basesyntax;

import java.util.Random;

public class Main {

    private static final Figure[] figures = new Figure[new Random().nextInt(3, 6)];
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < figures.length / 2 + 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int j = figures.length / 2; j < figures.length; j++) {
            figures[j] = figureSupplier.getDefaultFigure();
        }
        for (Figure showFigure : figures) {
            System.out.println(showFigure.info());
        }
    }
}
