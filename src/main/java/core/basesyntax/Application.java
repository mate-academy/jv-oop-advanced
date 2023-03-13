package core.basesyntax;

public class Application {
    private static final int LIMIT = 10;

    public static void main(String[] args) {

        Figure[] figures = new Figure[LIMIT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < LIMIT; i++) {
            if (i < LIMIT / 2) {
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
