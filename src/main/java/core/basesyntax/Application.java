package core.basesyntax;

import java.util.Random;

public class Application {

    private static final Figure[] FIGURES = new Figure[new Random().nextInt(3, 6)];
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {

        for (int i = 0; i < FIGURES.length / 2 + 1; i++) {
            FIGURES[i] = FIGURE_SUPPLIER.getRandomFigure();
        }
        for (int j = FIGURES.length / 2; j < FIGURES.length; j++) {
            FIGURES[j] = FIGURE_SUPPLIER.getDefaultFigure();
        }
        for (Figure figureShow : FIGURES) {
            System.out.println(figureShow.info());
        }
    }

}
