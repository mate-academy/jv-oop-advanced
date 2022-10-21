package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i >= 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        Arrays.stream(figures).forEach(figure -> System.out.println(figure.printInfo()));
    }
}
