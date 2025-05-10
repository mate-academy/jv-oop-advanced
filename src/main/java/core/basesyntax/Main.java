package core.basesyntax;

import auxiliary.Figure;
import auxiliary.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static void print(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure.getInfo());
        }
    }

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int number = 6;
        Figure[] figure = new Figure[number];
        for (int i = 0; i < number; i++) {
            if (i < number / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefFigure();
            }
        }
        print(figure);
    }
}
