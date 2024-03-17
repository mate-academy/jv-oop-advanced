package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MEDIUM_OF_NUMBER_OF_FIGURES = NUMBER_OF_FIGURES / 2;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            if (i == 2) {
                figures[i] = figureSupplier.getDefoltFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();

        }
    }
}