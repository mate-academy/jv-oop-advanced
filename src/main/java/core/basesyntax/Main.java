package core.basesyntax;

public class Main {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_AMOUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            figures[i] = FIGURES_AMOUNT / 2 > i ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}

