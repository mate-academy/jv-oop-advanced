package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int ARRAY = 5;

    public static void main(String[] args) {
        Random random = new Random();
        int countRandomFigure = random.nextInt(ARRAY);
        Figure[] figures = new Figure[countRandomFigure];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getFigure();
            figures[i].draw();
        }
    }
}
