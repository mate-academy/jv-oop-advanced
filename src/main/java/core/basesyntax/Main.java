package core.basesyntax;

import core.basesyntax.properties.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int numberOfFields = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] drawings = new Figure[numberOfFields];

        for (int i = 0; i < drawings.length; i++) {
            if (i <= 2) {
                drawings[i] = figureSupplier.getRandomFigure();
            } else {
                drawings[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure drawing : drawings) {
            drawing.draw();
        }
    }
}
