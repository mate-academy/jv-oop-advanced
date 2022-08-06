package core.basesyntax;

import suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            if (i >= 6 / 2) {
                System.out.println(figureSupplier.getDefaultFigure().getInfo());
            } else {
                System.out.println(figureSupplier.getRandomFigure().getInfo());
            }
        }
    }
}
