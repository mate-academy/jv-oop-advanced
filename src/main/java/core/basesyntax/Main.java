package core.basesyntax;

public class Main {
    private static final int LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = LENGTH / 2; i < LENGTH; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
