package core.basesyntax;

import core.basesyntax.figure.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArr = new Figure[6];

        for (int i = 0; i < figureArr.length; i++) {
            if (i < figureArr.length / 2) {
                figureArr[i] = figureSupplier.getRandomFigure();
                System.out.println(figureArr[i].draw());
            }
            if (i >= figureArr.length / 2) {
                figureArr[i] = figureSupplier.getDefaultFigure();
                figureArr[i].setColor("WHITE");
                System.out.println(figureArr[i].draw());
            }
        }
    }
}
