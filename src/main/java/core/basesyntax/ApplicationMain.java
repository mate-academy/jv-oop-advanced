package core.basesyntax;

import java.util.Random;

public class ApplicationMain {
    public static final int MAX_AMOUNT_OF_FIGURES = 7;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Random random = new Random();
        int randomAmountOfFigures = random.nextInt(MAX_AMOUNT_OF_FIGURES);
        int amountOfDefaultFigures = 0;
        if (randomAmountOfFigures < 3) {
            amountOfDefaultFigures = 3 - randomAmountOfFigures;
        }
        Figure[] figures = new Figure[randomAmountOfFigures + amountOfDefaultFigures];
        for (int i = 0; i < randomAmountOfFigures; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = randomAmountOfFigures; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
