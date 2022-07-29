package core.basesyntax;

public class Main {
    static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            for (int j = ARRAY_LENGTH / 2; j < ARRAY_LENGTH; j++) {
                figures[j] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
