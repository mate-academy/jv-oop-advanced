package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureSupplier;
import core.basesyntax.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[]{
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
                new Rectangle(10, 20, "BLUE")
                };

        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
