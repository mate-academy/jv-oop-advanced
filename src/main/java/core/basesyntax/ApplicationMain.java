package core.basesyntax;

public class ApplicationMain {
    private static final int COUNT_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_FIGURE];

        for (int i = 0; i < COUNT_FIGURE; i++) {
            if (i < COUNT_FIGURE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
