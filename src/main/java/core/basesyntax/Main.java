package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        Figure[] figures = new Figure[figureSupplier.FIGURE_COUNT];

        for (int i = 0; i < figureSupplier.FIGURE_COUNT; i++) {
            if (i < figureSupplier.FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].drawFigure());
            } else {
                figures[i] = defaultFigure;
                System.out.println(figures[i].drawFigure());
            }
        }
    }
}
