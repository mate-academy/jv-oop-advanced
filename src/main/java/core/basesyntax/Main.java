package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                figures[i] = randomFigure;
            } else {
                Figure defaultFigure = figureSupplier.getDefaultFigure();
                figures[i] = defaultFigure;
            }
            figures[i].draw();
        }
    }
}
