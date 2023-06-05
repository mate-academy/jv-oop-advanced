package core.basesyntax;

public class Main {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        AbstractFigure[] figures = new AbstractFigure[FIGURES_AMOUNT];

        for (int i = 0; i < FIGURES_AMOUNT / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = FIGURES_AMOUNT / 2; i < FIGURES_AMOUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (AbstractFigure figure : figures) {
            figure.draw();
        }
    }
}
