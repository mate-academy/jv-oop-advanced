package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawInfo();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].drawInfo();
            }
        }
    }
}
