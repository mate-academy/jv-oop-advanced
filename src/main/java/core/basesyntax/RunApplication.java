package core.basesyntax;

public class RunApplication {
    private static int NUM_OF_FIGURES = 10;
    private static int HALF_OF_ARRAY = NUM_OF_FIGURES / 2;
    private static FigureSupplier figureSuppluer = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUM_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i < HALF_OF_ARRAY) {
                figures[i] = figureSuppluer.getRandomFigure();
            } else {
                figures[i] = figureSuppluer.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
