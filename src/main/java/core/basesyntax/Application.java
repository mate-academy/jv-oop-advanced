package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        final int FIGURE_ARRAY_COUNT = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_COUNT];
        for (int i = 0; i < FIGURE_ARRAY_COUNT; i++) {
            figures[i] = (i >= (FIGURE_ARRAY_COUNT / 2)) ? figureSupplier.getDefaultFigure() :
                    figureSupplier.getRandomFigure();
        }
        for (Figure item : figures) {
            item.drawFigure();
        }
    }
}