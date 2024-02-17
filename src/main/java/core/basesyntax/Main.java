package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Figure[] figures = {
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
        };

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
