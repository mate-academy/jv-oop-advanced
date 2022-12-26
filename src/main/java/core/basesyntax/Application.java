package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        final int ARRAY_COUNT = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_COUNT];
        for (int i = 0; i < ARRAY_COUNT; i++) {
            figures[i] = (i >= (ARRAY_COUNT / 2)) ? figureSupplier.getDefaultFigure() :
                    figureSupplier.getRandomFigure();
        }
        for (Figure item : figures) {
            item.drawFigure();
        }
    }
}