package core.basesyntax;

import core.basesyntax.figures.Calculator;
import core.basesyntax.figures.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Calculator[] figures = new Calculator[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
