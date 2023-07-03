package core.basesyntax;

import core.basesyntax.properties.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] drawings = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < drawings.length / 2; i++) {
            drawings[i] = figureSupplier.getRandomFigure();
        }

        for (int i = drawings.length / 2; i < drawings.length; i++) {
            drawings[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure drawing : drawings) {
            drawing.draw();
        }
    }
}
