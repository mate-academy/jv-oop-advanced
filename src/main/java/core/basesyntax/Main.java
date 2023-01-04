package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;
import core.basesyntax.templates.Drawable;
import core.basesyntax.templates.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < 3 ? FigureSupplier.getRandomFigure()
                    : FigureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            ((Drawable) figure).draw();
        }
    }
}
