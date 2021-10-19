package core.basesyntax;

import java.util.Arrays;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH / 2) {
                figures[i] = figureSupplier.getRandom();
            } else {
                figures[i] = figureSupplier.getDefault();
            }
        }
        Arrays.stream(figures).forEach(figure -> figure.printInfo());
    }
}
