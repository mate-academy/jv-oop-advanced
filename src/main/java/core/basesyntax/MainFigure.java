package core.basesyntax;

import java.util.Random;

public class MainFigure {
    public static final int figureCount = 5;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();

        int quantityFigures = random.nextInt(figureCount);
        Figure[] figures = new Figure[quantityFigures];

        int[] numbersFigures = new int[figureCount];

        for (int i = 0; i < quantityFigures; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}

