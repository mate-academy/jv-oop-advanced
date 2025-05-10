package core.basesyntax;

public class Main {
    static final int FIGURES = 3;
    static final int ARRAY_LENGTH = FIGURES * 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            for (int j = FIGURES; j < ARRAY_LENGTH; j++) {
                figures[j] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
