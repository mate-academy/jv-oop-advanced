package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure [] figures = new Figure[3];

        for (int i = 0; i < 3; i++) {
            figures [i] = figureSupplier.getRandomFigure();
        }
    }
}
