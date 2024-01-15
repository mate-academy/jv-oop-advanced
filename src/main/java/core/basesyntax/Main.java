package core.basesyntax;

import core.basesyntax.figures.Drawable;
import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i <= figures.length / 2 - 1)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        Arrays.asList(figures).forEach(Drawable::draw);
    }
}
