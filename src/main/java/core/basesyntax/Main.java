package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suplire.FigureSupplier;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figuresRandom = new Figure[6];

        for (int i = 0; i < figuresRandom.length; i++) {
            figuresRandom[i] = figureSupplier.getRandomFigure();
        }

        Figure[] figuresStatic = new Figure[3];

        for (int i = 0; i < figuresStatic.length; i++) {
            figuresStatic[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure:figuresRandom
             ) {
            figure.drawFigure();
        }

        System.out.println("-----------------------------------------------------------------");

        for (Figure figure:figuresStatic
             ) {
            figure.drawFigure();
        }

    }
}
