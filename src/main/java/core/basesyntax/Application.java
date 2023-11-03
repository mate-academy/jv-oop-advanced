package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int FIGURES_AMOUNT = new Random().nextInt(3, 6);

    public static void main(String[] args) {
        final Figure[] figures = new Figure[FIGURES_AMOUNT];
        final FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figureShow : figures) {
            System.out.println(figureShow.draw());
        }
    }
}
