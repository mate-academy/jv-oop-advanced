package core.basesyntax;

public class MainApp {
    private final static int SIZE_FIGURE_ARRAY = 6;
    private final static FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_FIGURE_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
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
