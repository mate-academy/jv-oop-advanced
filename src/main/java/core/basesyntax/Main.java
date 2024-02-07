package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[new Random().nextInt(6)];
        for (int i = 0; i < figures.length; i++) {
            if (i <= 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
