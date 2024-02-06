package core.basesyntax;

public abstract class Main implements Drawable {
    private static final int NUMBER_OF_FIGURES_TO_GENERATE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES_TO_GENERATE];
        for (int i = 0; i < NUMBER_OF_FIGURES_TO_GENERATE; i++) {
            if (i >= 0 && i < NUMBER_OF_FIGURES_TO_GENERATE / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
