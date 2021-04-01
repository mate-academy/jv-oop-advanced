package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_PROPERTY_FIGURE_IN_ARRAY = 5;

    public static void main(String[] args) {
        Random random = new Random();
        int countRandomFigure = random.nextInt(MAX_PROPERTY_FIGURE_IN_ARRAY);
        Figure[] figures = new Figure[countRandomFigure];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getFigure();
            figures[i].draw();
        }
    }
}
