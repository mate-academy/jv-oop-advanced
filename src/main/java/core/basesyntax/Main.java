package core.basesyntax;

import core.basesyntax.entity.Drawable;
import core.basesyntax.entity.figure.Figure;
import core.basesyntax.service.FigureSupplier;
import java.util.ArrayList;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            figures.add(0, figureSupplier.getRandomFigure());
            figures.add(figureSupplier.getDefaultFigure());
        }
        figures.forEach(Drawable::draw);
    }
}
