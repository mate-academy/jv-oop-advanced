package core.basesyntax;

import abstracts.FigureAbstract;
import enums.Color;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        FigureAbstract figure1 = figureSupplier.getRandomFigure();
        FigureAbstract figure2 = figureSupplier.getRandomFigure();
        FigureAbstract figure3 = figureSupplier.getRandomFigure();
        FigureAbstract figure4 = figureSupplier.getDefaultFigure();
        FigureAbstract figure5 = new RightTriangle(Color.RED, 34, 15);
        FigureAbstract figure6 = new Square(Color.GREEN, 50);

        FigureAbstract[] figures = new FigureAbstract[] {
                figure1,
                figure2,
                figure3,
                figure4,
                figure5,
                figure6
        };

        for (FigureAbstract figure : figures) {
            figure.draw();
        }
    }
}
