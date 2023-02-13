package core.basesyntax;

public class MainApp {
    private static final int FIGURES_QUANTITY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_QUANTITY];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            figures[i] = i < FIGURES_QUANTITY / 2 ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
