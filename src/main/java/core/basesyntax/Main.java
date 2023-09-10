package core.basesyntax;

public class Main {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier randomFigures = new FigureSupplier();
        Figure[] array = new Figure[FIGURES_AMOUNT];
        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            if (i < FIGURES_AMOUNT / 2) {
                array[i] = randomFigures.getRandomFigure();
            } else {
                array[i] = randomFigures.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
