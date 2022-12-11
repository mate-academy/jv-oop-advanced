package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[6];

        for (int i = 0; i < figuresArray.length; i++) {
            if (i < 3) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultCircle();
            }
        }

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i].draw();
        }
    }
}
