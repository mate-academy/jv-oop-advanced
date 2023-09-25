package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.services.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[]{
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure()};
        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}
