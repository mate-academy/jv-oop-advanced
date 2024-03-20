package core.basesyntax;

import java.util.Random;

public class ApplicationMain {
    public static final int MAX_AMOUNT_OF_FIGURES = 6;
    public static final int MIN_AMOUNT_OF_FIGURES = 3;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Random random = new Random();
        int amountOfFigures = random.nextInt(MAX_AMOUNT_OF_FIGURES
                - MIN_AMOUNT_OF_FIGURES)
                + MIN_AMOUNT_OF_FIGURES;
        Figure[] figures = new Figure[amountOfFigures];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
