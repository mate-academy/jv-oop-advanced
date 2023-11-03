package core.basesyntax;

import java.util.Random;

public class Application {
    private static final Random RANDOM_VALUE = new Random();
    private static final int FIGURES_AMOUNT = RANDOM_VALUE.nextInt(3, 6);

    public static void main(String[] args) {
        final Figure[] figures = new Figure[FIGURES_AMOUNT];
        final FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figureShow : figures) {
            System.out.println(figureShow.info());
        }
    }
}
