package core.basesyntax;

public class Application {
    private static final int LIMIT = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            if (i < LIMIT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure fig : figures) {
            fig.draw();
        }
    }
}
