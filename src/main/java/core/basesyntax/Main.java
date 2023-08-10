package core.basesyntax;

public class Main {
    public static final int FIGURE_QUANTITY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_QUANTITY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].drawFigure());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].drawFigure());
            }
        }
    }
}
