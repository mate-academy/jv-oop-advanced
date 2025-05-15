package core.basesyntax;

import core.basesyntax.model.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[]{
                figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure()};

        for (var figure : figures) {
            System.out.println(figure);
        }
    }

}
