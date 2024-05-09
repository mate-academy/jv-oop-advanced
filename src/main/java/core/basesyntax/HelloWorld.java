package core.basesyntax;

import abstracts.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure figure1 = figureSupplier.getRandomFigure();
        Figure figure2 = figureSupplier.getRandomFigure();
        Figure figure3 = figureSupplier.getRandomFigure();
        Figure figure4 = figureSupplier.getRandomFigure();
        Figure figure5 = figureSupplier.getRandomFigure();
        Figure figure6 = figureSupplier.getRandomFigure();

        Figure[] figures = new Figure[] {
                figure1,
                figure2,
                figure3,
                figure4,
                figure5,
                figure6
        };

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
