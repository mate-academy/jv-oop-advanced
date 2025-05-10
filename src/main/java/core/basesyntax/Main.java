package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = ARRAY_LENGTH / 2; i < ARRAY_LENGTH; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
