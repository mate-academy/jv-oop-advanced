package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = new FigureSupplier().getRandomFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
