package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    public static void main(String[] args) {

        FigureSupplier fs = new FigureSupplier();

        Figure[] figures = new Figure[6];

        figures[0] = fs.getRandomFigure();
        figures[1] = fs.getRandomFigure();
        figures[2] = fs.getRandomFigure();

        figures[3] = fs.getDefaultFigure();
        figures[4] = fs.getDefaultFigure();
        figures[5] = fs.getDefaultFigure();

        for (Figure f : figures) {
            f.draw();
        }
    }
}
