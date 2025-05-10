package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_FIGURES_AMOUNT = 100;

    public static void main(String[] args) {
        int figuresAmount = new Random().nextInt(MAX_FIGURES_AMOUNT);
        Figure[] figures = new Figure[figuresAmount];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresAmount; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
