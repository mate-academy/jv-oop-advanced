package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getRandomFigure();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figuresArray) {
            figure.draw();
        }
        defaultFigure.draw();
    }
}
