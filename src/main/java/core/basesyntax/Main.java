package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[6];

        for (int i = 0; i < figuresArray.length; i++) {
            if (i < 3) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                System.out.println(figuresArray[i].showInfo());
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                System.out.println(figuresArray[i].showInfo());
            }
        }
    }
}

