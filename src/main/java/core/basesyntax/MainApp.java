package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        final int TEST_FIGURES_ARRAY_SIZE = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[TEST_FIGURES_ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length/2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
