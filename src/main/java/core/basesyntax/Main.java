package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random);
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        // System.out.println(Arrays.toString(figures)); do not show like in the example
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].toString());
        }
    }
}
