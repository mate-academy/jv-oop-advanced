package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            ColorSupplier colorSupplier = new ColorSupplier();
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].setColor(colorSupplier.getRandomColor());
            } else {
                figures[i] = figureSupplier.getDefoultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.print();
        }

    }
}
