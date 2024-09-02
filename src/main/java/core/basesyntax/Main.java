package core.basesyntax;

import java.util.Random;

public class Main {
    public static final Random random = new Random();
    public static final FigureSupplier figureSupplier = new FigureSupplier();
    public static final int FIGURES_AMOUNT = 10;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[FIGURES_AMOUNT];

        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            figuresArray[i] = i < FIGURES_AMOUNT / 2 ? figureSupplier.getRandomFigure()
                                                     : figureSupplier.getDefaultFigure();
            figuresArray[i].drawFigure();
        }

    }
}
