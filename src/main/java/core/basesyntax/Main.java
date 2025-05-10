package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[] {
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
        };

        System.out.println(Arrays.toString(figures));
    }
}
