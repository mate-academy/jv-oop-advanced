package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.services.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[8];
        for (int i = 0; i < figures.length; i++) {
            if(i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
            System.out.println();
        }
    }
}
