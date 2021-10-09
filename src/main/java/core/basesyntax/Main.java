package core.basesyntax;

import core.basesyntax.behaviour.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }
        for (Figure temp : figuresArray) {
            temp.draw();
        }
    }
}
