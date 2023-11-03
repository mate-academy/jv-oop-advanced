package core.basesyntax;

import java.util.Random;

public class Application {
    private static final Random random = new Random();
    private static final int FIGURES_AMOUNT = random.nextInt(3, 6);
    private static final Figure[] FIGURES = new Figure[FIGURES_AMOUNT];

    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES.length; i++) {
            if (i <= FIGURES.length / 2) {
                FIGURES[i] = figureSupplier.getRandomFigure();
            }
            if (i >= FIGURES.length / 2) {
                FIGURES[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figureShow : FIGURES) {
            System.out.println(figureShow.info());
        }
    }
}
