package core.basesyntax;

import java.util.Random;

public class Main {
    static final int NUMBER_MAX_DIAPASON = 10;

    public static void main(String[] args) {
        int value = new Random().nextInt(NUMBER_MAX_DIAPASON);;
        Figure[] figures = new Figure[value];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < value; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].getPrinting());
        }
    }
}
