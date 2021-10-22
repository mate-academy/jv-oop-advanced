package core.basesyntax;

public class AppMain {
    static final int MAX_VALUE_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_VALUE_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < MAX_VALUE_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = MAX_VALUE_FIGURES / 2; i < MAX_VALUE_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.infoDrawer();
        }
    }
}
