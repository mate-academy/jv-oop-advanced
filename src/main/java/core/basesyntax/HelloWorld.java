package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class HelloWorld {
    private static final int MAX_FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figuresArr = new Figure[MAX_FIGURES_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresArr.length; i++) {
            figuresArr[i] = i < figuresArr.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figuresArr[i].draw();

        }
    }
}
